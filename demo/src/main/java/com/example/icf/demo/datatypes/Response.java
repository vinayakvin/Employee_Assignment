package com.example.icf.demo.datatypes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;

public class Response extends ResponseEntity<String>{

	public Response(HttpStatus status) {
		super(status);
		// TODO Auto-generated constructor stub
	}
	
	public static <T> ResponseEntity<T> badRequest(@Nullable T body)
	{
		return badRequest().body(body);
	}
	
	public static <T> ResponseEntity<Employee> ok(@Nullable Employee body)
	{
		return ok().body(body);
	}
	

}
