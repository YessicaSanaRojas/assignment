package com.data.assignment.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "SIGNATURE")
public class Signature implements Serializable {
	
	private static final long serialVersionUID = -583251986763880555L;
	
	@Id
	@NotNull
	private Integer id;
	
	@NotNull
	private String name;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_TEACHER")
	private Teacher teacher;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_GRADE")
	private Course course;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "signature", cascade = CascadeType.ALL)
	List<SignatureStudent> listStudentSignat;
}
