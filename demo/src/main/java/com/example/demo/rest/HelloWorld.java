package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorld {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from Spring Boot!";
	}

	@PostMapping("/hello")
	public String sayHelloworld(String name) {
		return "Hello from Spring Boot!";
	}
}

