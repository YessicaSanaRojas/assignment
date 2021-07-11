package com.data.assignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.data.assignment.entity.SignatureStudent;

@Repository
public interface SignatureStudentRepository extends CrudRepository<SignatureStudent, Integer> {

}