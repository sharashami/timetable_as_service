package com.timetable.timetable.service;

import java.util.List;

public interface IProfessorService {

	List findAll();

	List findMyCourses(Long id);

}
