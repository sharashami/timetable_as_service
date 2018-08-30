package com.timetable.timetable.repository;

import org.springframework.data.repository.CrudRepository;

import com.timetable.timetable.model.ProfessorAvailableCourse;

public interface ProfessorAvailableCourseRepository extends CrudRepository<ProfessorAvailableCourse,Long>{
	
	//public List findAvailableCourse_ProgramStructureCourse_CourseByProfessorId(Long id);
}
