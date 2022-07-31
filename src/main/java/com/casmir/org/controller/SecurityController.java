package com.casmir.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class SecurityController {
	
	//localhost:8080/user/home
	@GetMapping("/home")
	public String home() {
		return "Welcome to the HOME Page";	
	}
	
	//localhost:8080/user/dashboard
	@GetMapping("/dashboard")
	public String dashboard() {
		return "Welcome to the DASHBOARD Page";	
	}

}
