package com.job_portal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping
	public String homeControllerHandler() {
		return "Deploy sucessfully!";
	}

	@GetMapping("/home")
	public String homeControllerHandler2() {
		return "Deploy sucessfully!";
	}
}
