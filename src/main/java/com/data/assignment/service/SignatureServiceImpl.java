package com.data.assignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.assignment.entity.Signature;
import com.data.assignment.repository.SignatureRepository;

@Service
public class SignatureServiceImpl<T> implements SignatureService<T>{

	@Autowired
	private SignatureRepository signatureRepository;
	
	@Override
	public void insert(Object t) {
		signatureRepository.save((Signature) t);
	}

	@Override
	public Optional<T> getOne(Integer i) {
		return (Optional<T>) signatureRepository.findById(i);
	}

	@Override
	public List<T> getAll() {
		return (List<T>) signatureRepository.findAll();
	}

	@Override
	public List<T> getAllByList(List<Integer> itera) {
		List<Signature> result = new ArrayList<Signature>();
		Iterable<Signature> iterab = signatureRepository.findAllById(itera); 
		iterab.forEach(result::add);
		return (List<T>) result;
	}
}
