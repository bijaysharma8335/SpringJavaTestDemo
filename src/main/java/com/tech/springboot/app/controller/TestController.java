package com.tech.springboot.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
	@RequestMapping("/testurl")
	public String testvalue() {
		return "Hello Spring Framework";
		
	}

}
