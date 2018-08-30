package com.timetable.timetable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timetable.timetable.service.ICourseService;
import com.timetable.timetable.service.IProfessorService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class CourseController {
	
	@Autowired
	private ICourseService courseService;
	/*
	
	@GetMapping("/courses")
	public List findAll() {
	    return courseService.findAll();
	}*/
}
