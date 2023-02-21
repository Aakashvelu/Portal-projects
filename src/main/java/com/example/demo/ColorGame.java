package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorGame {
	@GetMapping("/color")
	public String getColor() {
		String Color = "White";
		return "My favorite color is "+ Color;
	}
}
