package com.data.assignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.data.assignment.entity.Collegue;
import com.data.assignment.repository.CollegueRepository;

public class CollegueServiceImpl<T> implements CollegueService<T> {

	@Autowired
	private CollegueRepository collegueRepository;
	
	@Override
	public void insert(T t) {
		collegueRepository.save((Collegue) t);
		
	}

	@Override
	public Optional<T> getOne(Integer i) {
		return (Optional<T>) collegueRepository.findById(i);
	}

	@Override
	public List<T> getAll() {
		List<Collegue> result = new ArrayList<Collegue>();
		Iterable<Collegue> iteraCollegue = collegueRepository.findAll(); 
		iteraCollegue.forEach(result::add);
		return (List<T>) result;
	}

	@Override
	public List<T> getAllByList(List<Integer> itera) {
		List<Collegue> result = new ArrayList<Collegue>();
		Iterable<Collegue> iteraCollegue = collegueRepository.findAllById(itera); 
		iteraCollegue.forEach(result::add);
		return (List<T>) result;
	}

}
