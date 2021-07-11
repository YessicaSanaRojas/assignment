package com.data.assignment.service;

import java.util.List;
import java.util.Optional;

public interface GeneralService<T> {
	public void insert(T t);
	public Optional<T> getOne(Integer i);
	public List<T> getAll();
	public List<T> getAllByList(List<Integer> itera);
}
