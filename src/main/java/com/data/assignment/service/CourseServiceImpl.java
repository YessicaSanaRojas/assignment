package com.data.assignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.data.assignment.entity.Course;
import com.data.assignment.repository.CourseRepository;

public class CourseServiceImpl<T> implements CourseService<T> {

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public void insert(T t) {
		courseRepository.save((Course) t);
		
	}

	@Override
	public Optional<T> getOne(Integer i) {
		return (Optional<T>) courseRepository.findById(i);
	}

	@Override
	public List<T> getAll() {
		return (List<T>) courseRepository.findAll();
	}

	@Override
	public List<T> getAllByList(List<Integer> itera) {
		List<Course> result = new ArrayList<Course>();
		Iterable<Course> iterab = courseRepository.findAllById(itera); 
		iterab.forEach(result::add);
		return (List<T>) result;
	}

}
