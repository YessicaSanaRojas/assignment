package com.data.assignment.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
@Setter
@Getter
@Embeddable
@Entity
@Table(name = "SIGNATURE_STUDENT")
public class SignatureStudent implements Serializable {

	private static final long serialVersionUID = 1482309012074360198L;

	@JsonIgnore
	@Id
	@Column(name = "ID_SIGNATURE_STUDENT")
	private Integer idSignatureStudent;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_SIGNATURE")
	private Signature signature;
		
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_STUDENT")
	private Student student;
	
	private BigDecimal note;
}

