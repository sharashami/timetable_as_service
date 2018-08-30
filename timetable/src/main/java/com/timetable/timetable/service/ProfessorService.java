package com.timetable.timetable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timetable.timetable.repository.AvailableCourseRepository;
import com.timetable.timetable.repository.CourseRepository;
import com.timetable.timetable.repository.ProfessorAvailableCourseRepository;
import com.timetable.timetable.repository.ProfessorRepository;

@Service
public class ProfessorService implements IProfessorService {
	
	@Autowired
	private ProfessorRepository repository;
	
	@Autowired
	private AvailableCourseRepository availableCourseRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private ProfessorAvailableCourseRepository professorAvailableCourseRepository;
	
	
	@Override
    public List findAll() {
        return (List) repository.findAll();
    }

	@Override
	public List findMyCourses(Long id) {
		//professorAvailableCourseRepository
		
		return (List) courseRepository.findAll();
	}
}
