package com.casmir.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	//localhost:8080/admin/home
	@GetMapping("/home")
	public String home() {
	return "Welcome to ADMIN HOME page";		
	}
	
	//localhost:8080/admin/dashboard
	@GetMapping("/dashboard")
	public String dashboard() {
	return "Welcome to ADMN DASHBOARD page";		
	}
}
