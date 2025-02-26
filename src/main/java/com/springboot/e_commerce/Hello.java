package com.springboot.e_commerce;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping("/")
	public String greet() {
		return "Hello World";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "This is about page";
	}
	
}
