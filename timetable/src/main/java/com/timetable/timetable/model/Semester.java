package com.timetable.timetable.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.timetable.timetable.utils.Definicoes;

import lombok.Data;


@Table(name="semester")
@Entity
@Data
public class Semester  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;	

	@Column(unique=true,length=Definicoes.STRING_NOME)
	@NotNull
	private String description;

	@Column(columnDefinition="boolean default true")
	@NotNull
	private boolean enabled;

	
	
}
