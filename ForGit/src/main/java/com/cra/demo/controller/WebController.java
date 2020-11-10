package com.cra.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello world!!!!";
	}
	@GetMapping("/hi")
	public String sayHi() {
		return "Hi world.....ffom jenkins!!!!";
	}
	@GetMapping("/welcome")
	public String sayWelcome() {
		return "Welcome world!!!!";
	}

}
