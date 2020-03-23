package com.spain.csd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/v1")
public class ApplicationController {
	
	@RequestMapping(value = "/myReg")
	public String myRegistration() {
		return "welcome";
	}
}
