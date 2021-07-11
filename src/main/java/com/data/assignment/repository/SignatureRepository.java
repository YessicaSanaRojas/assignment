package com.data.assignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.data.assignment.entity.Signature;

@Repository
public interface SignatureRepository extends CrudRepository<Signature, Integer> {

}