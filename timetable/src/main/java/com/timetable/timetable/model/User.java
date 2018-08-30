package com.timetable.timetable.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Table(name="user")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public abstract class User  implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
	private Long id;
	

	@Column( unique=true,length=100)
	@NotNull
	private String name;

	@Column( unique=true,length=100)
	@NotNull
	private String email;
	

	@Column
	@NotNull
	private Date dateOfBirth;

	@Column( columnDefinition="boolean default true")
	@NotNull
	private boolean enabled;
}
