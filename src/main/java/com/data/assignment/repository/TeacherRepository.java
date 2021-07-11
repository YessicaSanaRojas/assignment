package com.data.assignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.data.assignment.entity.Teacher;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Integer> {

}
