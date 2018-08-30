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

@Table(name="program_structure")
@Entity
@Data
public class ProgramStructure implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;	
	
	@Column(unique=true,length=Definicoes.STRING_NOME)
	@NotNull
	private String description;

	@Column(columnDefinition="boolean default false")
	@NotNull
	private boolean enabled;
	
	@ManyToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
	@JoinColumn(name = "program_id")
	private Program program;

	@OneToMany(mappedBy = "programStructure")
	private Set<ProgramStructureCourses> programStructureCourses;
	
}
