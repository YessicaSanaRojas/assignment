package com.data.assignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.data.assignment.entity.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

}
