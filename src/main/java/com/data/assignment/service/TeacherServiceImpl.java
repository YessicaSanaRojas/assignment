package com.data.assignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.assignment.entity.Teacher;
import com.data.assignment.repository.TeacherRepository;

@Service
public class TeacherServiceImpl<T> implements TeacherService<T> {

	@Autowired
	private TeacherRepository teacherRepository;
	
	@Override
	public void insert(Object t) {
		teacherRepository.save((Teacher) t);
	}

	@Override
	public Optional<T> getOne(Integer i) {
		return (Optional<T>) teacherRepository.findById(i);
	}

	@Override
	public List<T> getAll() {
		return (List<T>) teacherRepository.findAll();
	}

	@Override
	public List<T> getAllByList(List<Integer> itera) {
		List<Teacher> result = new ArrayList<Teacher>();
		Iterable<Teacher> iterab = teacherRepository.findAllById(itera); 
		iterab.forEach(result::add);
		return (List<T>) result;
	}

}
