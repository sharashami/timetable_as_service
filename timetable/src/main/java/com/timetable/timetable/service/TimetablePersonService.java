package com.timetable.timetable.service;

import org.springframework.stereotype.Service;

import com.timetable.timetable.Person;
import com.timetable.timetable.PersonService;

@Service
public class TimetablePersonService implements PersonService{

	
	@Override
	public Person johnSmith() {
		final Person person = new Person();
	    person.setFirstname("John");
	    person.setLastname("Smith");
	    return person;
	}

	@Override
	public String hello(Person person) {
		 return "Hello " + person.getFirstname() + " " + person.getLastname() + "!";
	}
	


}
