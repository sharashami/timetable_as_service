package com.timetable.timetable.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import lombok.Data;

@Entity
@Table(name="course")
/*@NamedQueries({//nome da classe
	 @NamedQuery(name=Definicoes.DISCIPLINAS_LISTAR, query="SELECT d FROM Disciplina d"),
	 @NamedQuery(name=Definicoes.DISCIPLINAS_BUSCAR, query="SELECT d FROM Disciplina d WHERE d.curso.id = :curso AND d.semestre = :semestre"),
	 //@NamedQuery(name=Definicoes.DISCIPLINAS_OFERTADAS, query="SELECT d FROM Disciplina d WHERE d.ofertada = true"),
	 @NamedQuery(name=Definicoes.DISCIPLINA_COUNT, query="SELECT COUNT(d) FROM Disciplina d")
})*/
@Data
public class Course implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
	private Long id;

	@Column( unique=true,length=100)
	@NotNull
	private String description;

	@Column( columnDefinition="integer default 4")
	@NotNull
	private int credits;

	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch= FetchType.LAZY)
	private Set<ProgramStructureCourses> programStructureCourses;
	
}
