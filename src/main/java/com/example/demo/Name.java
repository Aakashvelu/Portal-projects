package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
	@GetMapping("/name")
	public String getName() {
		String nit = "IamNeo";
		return "Welcome "+ nit;
	}
}