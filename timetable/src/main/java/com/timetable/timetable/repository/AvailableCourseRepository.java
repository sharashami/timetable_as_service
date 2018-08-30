package com.timetable.timetable.repository;

import org.springframework.data.repository.CrudRepository;

import com.timetable.timetable.model.AvailableCourse;
import com.timetable.timetable.model.Course;

public interface AvailableCourseRepository extends CrudRepository<AvailableCourse,Long>{
	
}
