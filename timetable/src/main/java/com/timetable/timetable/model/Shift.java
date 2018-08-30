package com.timetable.timetable.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Table
@Entity
@Data
public class Shift implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(unique=true,length=100)
	@NotNull
	private String description;

}
