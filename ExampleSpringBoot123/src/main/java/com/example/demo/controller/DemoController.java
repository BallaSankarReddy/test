package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/sayHello/{name}")
	public String sayHello(@PathVariable String name) {
		String str=name;
		return "Calling from DemoController Class.."+str;
	}

	
}
