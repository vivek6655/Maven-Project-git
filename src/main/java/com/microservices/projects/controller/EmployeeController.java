package com.microservices.projects.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/home")
	public String getGreeting() {
		return "Hello, welcome to My Application!";
	}
	
	@GetMapping("/names")
	public List<String> fetchNames() {
		List<String> names = List.of("Alice", "Bob", "Charlie");
		return names;
	}
	
	

}
