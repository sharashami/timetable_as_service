package com.timetable.timetable.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Table(name="user_auth")
@Entity
@Data
//https://www.baeldung.com/hibernate-inheritance
public class UserAuth extends User implements Serializable{
	private static final long serialVersionUID = 1L;


	@Column(unique=true,length=100)
	@NotNull
	private String login;
	
	@Column(length=100)
	@NotNull
	private String password;
	
	@Column(length=255)
	private String token;
}
