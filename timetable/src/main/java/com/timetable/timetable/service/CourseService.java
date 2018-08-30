package com.timetable.timetable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timetable.timetable.repository.CourseRepository;
import com.timetable.timetable.repository.ProfessorRepository;

@Service
public class CourseService implements ICourseService {
	
	@Autowired
	private CourseRepository repository;
	
	@Override
    public List findAll() {
        return (List) repository.findAll();
    }
}
