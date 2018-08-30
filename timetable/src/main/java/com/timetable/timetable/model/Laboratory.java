package com.timetable.timetable.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.timetable.timetable.utils.Definicoes;

import lombok.Data;


@Table
@Entity
@Data
public class Laboratory  implements Serializable {
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


	@ManyToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
	@JoinColumn(name = "field_id")
	private Field field;
	
}
