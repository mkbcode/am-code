package com.am.appam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/")
	public String getHome() {
		return "working";
	}
	
	@GetMapping("/api/user/test")
	public String getTestUser() {
		return "getTestUser";
	}
	
	@GetMapping("/api/user/example")
	public String getTestExample() {
		return "getTestExample";
	}
	
	@GetMapping("/api/user/dummy")
	public String getTestDummy() {
		return "getTestDummy";
	}
	
	
}
