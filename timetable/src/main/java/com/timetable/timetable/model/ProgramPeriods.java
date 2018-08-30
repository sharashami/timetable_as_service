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

@Entity
@Table(name = "program_periods")/*
@NamedQueries({
	@NamedQuery(name=Definicoes.PERIODO_DO_CURSO,query="SELECT c FROM CursosPeriodos c WHERE c.curso.id = :idCurso"),
	@NamedQuery(name=Definicoes.PERIODO_GET,query="SELECT c FROM CursosPeriodos c WHERE c.curso.id = :idCurso AND c.turno.id = :idTurno")
})*/
@Data
public class ProgramPeriods  implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
	private Integer id;
	
	@JoinColumn(name = "program_id")
	@NotNull
	@ManyToOne(cascade = CascadeType.ALL)
	private Program program;
	
	@JoinColumn(name = "shift_id")
	@NotNull
	@ManyToOne(cascade = CascadeType.ALL)
	private Shift shift;


	@Column
	@NotNull
	private int periodsNumber;
	

}
