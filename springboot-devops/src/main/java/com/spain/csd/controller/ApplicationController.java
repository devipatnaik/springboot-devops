package com.spain.csd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class ApplicationController {
	
	@RequestMapping(value = "/myReg")
	public String myRegistration() {
		return "Do Registration, For DevOps Demonstration, Thank You.";
	}
}
