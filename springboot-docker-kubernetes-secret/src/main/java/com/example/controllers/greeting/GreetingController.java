package com.example.controllers.greeting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value(value = "${secret-message:}")
	private String secretMessage;

	@RequestMapping(value="/")
	public String greeting() {		
		return !"".equals(secretMessage) ? secretMessage : "Can not read secret message from secrets!";
	}
	
}