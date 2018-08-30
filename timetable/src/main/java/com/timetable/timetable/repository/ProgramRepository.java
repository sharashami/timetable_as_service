package com.timetable.timetable.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.timetable.timetable.model.Field;
import com.timetable.timetable.model.Program;


public interface ProgramRepository extends CrudRepository<Program,Long> { 
	
	public List<Program> findByField(Field field);
	
}
