package com.data.assignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.data.assignment.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
