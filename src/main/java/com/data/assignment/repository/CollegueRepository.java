package com.data.assignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.data.assignment.entity.Collegue;

@Repository
public interface CollegueRepository extends CrudRepository<Collegue, Integer>{

}
