package com.timetable.timetable.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Table(name="professor")
@Entity
@Data
//https://www.baeldung.com/hibernate-inheritance
public class Professor extends User implements Serializable{
	private static final long serialVersionUID = 1L;


	@Column(columnDefinition="integer default 0")
	@NotNull
	private int totalCredits;

	@Column( columnDefinition="integer default 0")
	@NotNull
	private int freeCredits;
}
