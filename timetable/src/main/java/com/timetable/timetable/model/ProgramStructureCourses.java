package com.timetable.timetable.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Table(name="program_structure_courses")
@Entity
@Data
public class ProgramStructureCourses implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;	
	
	@Column(name="semester_number")
	@NotNull
	private int semesterNumber;

	
	@ManyToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name = "course_id")
	private Course course;
	
	@ManyToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name = "program_structure_id")
	private ProgramStructure programStructure;

	
	
}
