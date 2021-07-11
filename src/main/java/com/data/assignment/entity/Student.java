package com.data.assignment.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name = "STUDENT")
@Getter
@Setter
@NoArgsConstructor
public class Student implements Serializable{

	private static final long serialVersionUID = -3253100235120196828L;

	@Id
	@NotNull
	private Integer id;
	
	private String name;

	@JsonIgnore
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	List<SignatureStudent> listSignature;
}
