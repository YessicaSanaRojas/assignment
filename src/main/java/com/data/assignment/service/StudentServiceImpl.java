package com.data.assignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.assignment.entity.Student;
import com.data.assignment.repository.StudentRepository;

@Service
public class StudentServiceImpl<T> implements StudentService<T> {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void insert(Object t) {
		studentRepository.save((Student) t);
	}

	@Override
	public Optional<T> getOne(Integer i) {
		return (Optional<T>) studentRepository.findById(i);
	}

	@Override
	public List<T> getAll() {
		return (List<T>) studentRepository.findAll();
	}

	@Override
	public List<T> getAllByList(List<Integer> itera) {
		List<Student> result = new ArrayList<Student>();
		Iterable<Student> iterab = studentRepository.findAllById(itera); 
		iterab.forEach(result::add);
		return (List<T>) result;
	}
	
}
