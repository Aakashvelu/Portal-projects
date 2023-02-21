package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueAnnotation {
	@Value("${name.value}")
	public String name;
	
	@GetMapping("/v")
	public String getColor() {
		return name;
	}
}
