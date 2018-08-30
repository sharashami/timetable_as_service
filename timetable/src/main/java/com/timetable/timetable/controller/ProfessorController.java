package com.timetable.timetable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timetable.timetable.service.IProfessorService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class ProfessorController {
	
	@Autowired
	private IProfessorService professorService;
	
	
	@GetMapping("/professors")
	public List findAll() {
	    return professorService.findAll();
	}

	//@GetMapping(path= {"/professors/{id}/courses"})
	@GetMapping("/courses")
	public List courses() {
	    return professorService.findMyCourses(0L);
	}
	
}
