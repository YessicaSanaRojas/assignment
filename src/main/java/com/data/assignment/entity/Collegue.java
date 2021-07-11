package com.data.assignment.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name = "collegue")
public class Collegue {

	@Id
	@NotNull
	private Integer id;
	
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "collegue")
	private List<Course> listCourse;
	
}
