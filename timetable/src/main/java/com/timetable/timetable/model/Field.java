package com.timetable.timetable.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.timetable.timetable.utils.Definicoes;

import lombok.Data;


@Table(name="field")
@Entity
/*@NamedQueries({//nome da classe
	@NamedQuery(name=Definicoes.EIXO_LISTAR, query="SELECT e FROM Eixo e"),
	@NamedQuery(name = Definicoes.EIXO_COUNT, query="SELECT COUNT(e) FROM Eixo e")
})*/ 
@Data
public class Field  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	

	@Column( unique=true,length=Definicoes.STRING_NOME)
	@NotNull
	private String description;

	@Column( columnDefinition="boolean default true")
	@NotNull
	private boolean enabled;

	
	
}
