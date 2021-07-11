package com.data.assignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.data.assignment.entity.SignatureStudent;
import com.data.assignment.repository.SignatureStudentRepository;

public class SignatureStudentServiceImpl<T> implements SignatureStudentService<T> {

	@Autowired
	private SignatureStudentRepository signatureStudentRepository;
	
	@Override
	public void insert(T t) {
		signatureStudentRepository.save((SignatureStudent) t);
	}

	@Override
	public Optional<T> getOne(Integer i) {
		return (Optional<T>) signatureStudentRepository.findById(i);
	}

	@Override
	public List<T> getAll() {
		return (List<T>) signatureStudentRepository.findAll();
	}

	@Override
	public List<T> getAllByList(List<Integer> itera) {
		List<SignatureStudent> result = new ArrayList<SignatureStudent>();
		Iterable<SignatureStudent> iterab = signatureStudentRepository.findAllById(itera); 
		iterab.forEach(result::add);
		return (List<T>) result;
	}

}
