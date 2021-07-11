package com.data.assignment.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "GRADE")
@Data
public class Course {

	@Id
	@NotNull
	private Integer id;
	
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	private List<Signature> listGrade;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_COLLEGUE")
	private Collegue collegue;
	
}
