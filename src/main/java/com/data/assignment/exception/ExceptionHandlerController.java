package com.data.assignment.exception;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.exception.SQLGrammarException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.InvalidDataAccessResourceUsageException;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class ExceptionHandlerController {

  /**
   * Handle all the exceptions with a generic message
   * 
   * @param exception
   * @return
   */
  @ExceptionHandler(HException.class)
  protected ResponseEntity<Set<HErrorDTO>> handleHException(final HttpServletRequest request, final HException exception) {
    return ResponseEntity.badRequest()
        .body(Set.of(exBuilder(exception.getUserMessage(), exception.getTechMessage(), exception.getField(), request.getRequestURI(), exception)));
  }

  /**
   * Handle all the exceptions with a generic message
   * 
   * @param exception
   * @return
   */
  @ExceptionHandler(Exception.class)
  protected ResponseEntity<Set<HErrorDTO>> handleOtherException(final HttpServletRequest request, final Exception exception) {
    return ResponseEntity.badRequest().body(Set.of(exBuilder(Errors.GENERIC_ERROR, request.getRequestURI(), exception)));
  }
  /**
   * Functional exception, generic message
   * 
   * @param exception
   * @return
   */
  @ExceptionHandler(NoSuchElementException.class)
  protected ResponseEntity<Set<HErrorDTO>> handleNoElementException(final HttpServletRequest request, final Exception exception) {
    return ResponseEntity.badRequest().body(Set.of(exBuilder(Errors.NO_DATA, request.getRequestURI(), exception)));
  }

  @ExceptionHandler(EntityNotFoundException.class)
  protected ResponseEntity<Set<HErrorDTO>> handleEntityNotFoundException(final HttpServletRequest request, final Exception exception) {
    return ResponseEntity.badRequest().body(Set.of(exBuilder(exception.getMessage(), exception.getMessage(), request.getRequestURI(), exception)));
  }

  @ExceptionHandler({MismatchedInputException.class, HttpMessageNotReadableException.class})
  protected ResponseEntity<Set<HErrorDTO>> handleJSONException(final HttpServletRequest request, final Exception exception) {
    String exMessage = exception.getMessage();
    Pattern p = Pattern.compile("\\[\\\"\\w*\\\"\\]");
    Matcher m = p.matcher(exMessage);
    HErrorDTO error;
    String path = request.getRequestURI();
    if (m.find()) {
      String value = m.group(m.groupCount()).replace("\"", "'");
      error = exBuilder(Errors.MISMATCH_FIELD, value, path, exception);
    } else {
      error = exBuilder(Errors.MISMATCH_INPUT, path, exception);
    }
    return ResponseEntity.badRequest().body(Set.of(error));
  }

  @ExceptionHandler({DataIntegrityViolationException.class})
  protected ResponseEntity<Set<HErrorDTO>> handleConstraintViolationException(final HttpServletRequest request, final Exception exception) {
    DataIntegrityViolationException dataIntegrityViolation = (DataIntegrityViolationException) exception;
    return ResponseEntity.badRequest()
        .body(Set.of(exBuilder(Errors.BAD_QUERY.getCode(), dataIntegrityViolation.getMessage(), request.getRequestURI(), exception)));
  }

  /**
   * Date Time exception
   * 
   * @param exception
   * @return
   */
  @ExceptionHandler(DateTimeParseException.class)
  protected ResponseEntity<Set<HErrorDTO>> handleDateTimeParseException(final HttpServletRequest request, final DateTimeParseException exception) {
    return ResponseEntity.badRequest().body(Set.of(exBuilder(Errors.INVALID_DATE_FORMAT, request.getRequestURI(), exception)));
  }

  @ExceptionHandler({SQLException.class, SQLGrammarException.class, InvalidDataAccessResourceUsageException.class})
  protected ResponseEntity<Set<HErrorDTO>> handleSQLException(final HttpServletRequest request, final Exception exception) {
    Exception e = (Exception) exception.getCause();
    return ResponseEntity.badRequest().body(Set.of(exBuilder(Errors.BAD_QUERY, request.getRequestURI(), e)));
  }

  /**
   * Build the DTO to be send as response
   * 
   * @param userMessage
   * @param techMessage
   * @param path
   * @param e
   * @return
   */
  private HErrorDTO exBuilder(String userMessage, String techMessage, String field, String path, Exception e) {
    log.error(userMessage, e);
    return HErrorDTO.builder() //
        .field(field) //
        .userMessage(userMessage) //
        .techMessage(techMessage)/// + e.getCaus
        .timestamp(LocalDateTime.now()) //
        .path(path) //
        .build();
  }

  private HErrorDTO exBuilder(String userMessage, String techMessage, String path, Exception e) {
    return exBuilder(userMessage, techMessage, null, path, e);
  }

  private HErrorDTO exBuilder(Errors error, String field, String path, Exception e) {
    return exBuilder(error.getCode(), error.getMessage(), field, path, e);
  }

  private HErrorDTO exBuilder(Errors error, String path, Exception e) {
    return exBuilder(error, null, path, e);
  }
  
}
