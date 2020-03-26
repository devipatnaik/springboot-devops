package com.spain.csd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootDevopsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootDevopsApplication.class, args);
		System.out.println("main called ====");
		
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringbootDevopsApplication.class);
	}

}
