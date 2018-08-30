package com.timetable.timetable;

import retrofit2.http.GET;

import retrofit2.Call;

public interface PersonApi {
	@GET("person/jonsmith")
	Call<Person> jonSmith();
}
