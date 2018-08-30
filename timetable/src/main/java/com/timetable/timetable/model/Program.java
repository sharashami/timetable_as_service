package com.timetable.timetable.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.timetable.timetable.utils.Definicoes;

import lombok.Data;

@Table(name="program")
@Entity/*
@NamedQueries({
	@NamedQuery(name=Definicoes.CURSO_LISTAR,query="SELECT c FROM Curso c"),
	@NamedQuery(name=Definicoes.CURSO_LISTAR_EIXO,query="SELECT c FROM Curso c where c.eixo.id=:eixo"),
	@NamedQuery(name=Definicoes.CURSO_COUNT,query="SELECT COUNT(c) FROM Curso c")
})*/
@Data
public class Program implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;	
	
/*
	@OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)//nome do campo que estara no objeto matrizcurricular
	private Collection<MatrizCurricular> matrizCurricularList;*/
	
	@Column( unique=true,length=Definicoes.STRING_NOME)
	@NotNull
	private String description;

	@Column( columnDefinition="boolean default false")
	@NotNull
	private boolean enabled = true;

	@Column( unique=true,length=Definicoes.STRING_NOME)
	@NotNull
	private String acronym;

	@ManyToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
	@JoinColumn(name = "field_id")
	private Field field;

	@OneToMany(mappedBy ="program",fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
	private Set<ProgramPeriods> programPeriods;

	@OneToMany(mappedBy ="program",fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
	private Set<ProgramStructure> programStructure;
	
	
	
}
