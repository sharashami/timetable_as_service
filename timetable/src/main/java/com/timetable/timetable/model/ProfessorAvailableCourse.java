package com.timetable.timetable.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Table(name="professor_available_course")
@Entity
@Data
public class ProfessorAvailableCourse implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
	private Long id;

	
	@ManyToOne
	@JoinColumn(name="professor_id")
	@NotNull
	private Professor professor;
	
	@ManyToOne
	@JoinColumn(name="available_course_id")
	@NotNull
	private AvailableCourse availableCourse;
	
	
	
}
