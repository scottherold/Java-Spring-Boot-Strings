package com.sherold.stringsassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

//This annotation allows for this file to be used as a 'controller'
@RestController
public class StringsassignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsassignmentApplication.class, args);
	}
	
	// This annotation will allow a response to the route '/'
	@RequestMapping("/")
	public String home() {
		return "Hello client! How are you doing?";
	}
	
	// This annotation will allow a response to the route '/random'
	@RequestMapping("/random")
	public String random() {
		return "Spring boot is great! So easy to just respond with strings";
	}

}
