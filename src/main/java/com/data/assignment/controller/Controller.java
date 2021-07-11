package com.data.assignment.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.data.assignment.entity.Teacher;
import com.data.assignment.response.ResponseClass;
import com.data.assignment.service.TeacherService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {
	
	@Autowired
	private TeacherService<Teacher> teacherService;
	
	@GET
	@GetMapping("/Teacher")
	public ResponseEntity<Teacher> teacher(@RequestParam("idTeacher")Integer idTeacherVar) {
		System.out.println("Get into Teachers method");
		Teacher teacherResponse = new Teacher();
		ResponseClass responseClass = new ResponseClass();
		Optional<Teacher> teacherQuery = (Optional<Teacher>) teacherService.getOne(idTeacherVar);
			teacherResponse.setId(teacherQuery.get().getId());
			teacherResponse.setName(teacherQuery.get().getName());
			teacherResponse.setSignatures(teacherQuery.get().getSignatures());
			responseClass.setTeacher(teacherResponse);
		
		return new ResponseEntity<Teacher>(teacherQuery.get(), HttpStatus.OK);
	}
	
	@GET
	@GetMapping("/teachers")
	public ResponseEntity<List<Teacher>> listTeachers(){
		System.out.println("He llegado al servicio de Teachers");
		List<Teacher> listTeacher = new ArrayList<Teacher>();
		listTeacher = teacherService.getAll();
		listTeacher.forEach(x -> x.setSignatures(null));
		listTeacher = listTeacher.stream().sorted((x1, x2) -> x1.getId().compareTo(x2.getId())).collect(Collectors.toList());
		return new ResponseEntity<List<Teacher>>(listTeacher, HttpStatus.OK);
	}
	
	@GET
	@GetMapping("/test")
	public ResponseEntity<String> log(){
		return new ResponseEntity<String>("Ok", HttpStatus.OK);
	}
}
