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

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TEACHER")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Teacher {

	@Id
	private Integer id;
	
	@NotNull
	private String name;
	@OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
	private List<Signature> signatures;
	
	public Teacher(String name) {
		this.name = name;
	}
}
