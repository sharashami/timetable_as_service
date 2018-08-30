package com.timetable.timetable;

import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PRIVATE;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timetable.timetable.exception.TimetableException;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

@RestController
@RequestMapping("/person")
@AllArgsConstructor(access = PACKAGE)
@FieldDefaults(level = PRIVATE, makeFinal = true)
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)// is used to allow Cross-Origin Resource Sharing (CORS) so that our angular application running on different server can consume these APIs from a browser
public class PersonController {
	@NonNull
	PersonService persons;
	
	@GetMapping("/hello")
	public Person hello() {
	    return persons.johnSmith();
	}
	 
	@PostMapping("/hello")
	public String postHello(@RequestBody final Person person) {
		return persons.hello(person);
	}
	
	@GetMapping("/exception")
	public void exception() throws TimetableException {
	  throw new  TimetableException();
	}
}
