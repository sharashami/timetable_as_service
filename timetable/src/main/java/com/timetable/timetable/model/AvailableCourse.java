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

@Table(name="available_course")
@Entity/*
@NamedQueries({//nome da classe
	 @NamedQuery(name=Definicoes.DISCIPLINA_OFERTA_LISTAR, query="SELECT d FROM DisciplinaOferta d")
})*/
@Data
public class AvailableCourse implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name="semester_id")
	@NotNull
	private Semester semester;
	
	@ManyToOne
	@JoinColumn(name="shift_id")
	@NotNull
	private Shift shift;
	
	@ManyToOne
	@JoinColumn(name="program_structure_course_id")
	@NotNull
	private ProgramStructureCourses programStructureCourse;
	
	@Column(columnDefinition="integer default 0")
	@NotNull
	private int totalCredits;

	@Column(columnDefinition="integer default 0")
	@NotNull
	private int freeCredits;
	
	
}
