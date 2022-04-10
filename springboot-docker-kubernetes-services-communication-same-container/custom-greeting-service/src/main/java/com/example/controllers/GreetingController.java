package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.responses.GreetingResponse;
import com.example.responses.TextResponse;

@RestController
public class GreetingController {

	private static final String VERSION = "1";
	
	private Environment environment;
	
	private RestTemplate restTemplate;
	
	@Autowired
	public GreetingController(RestTemplate restTemplate, Environment environment) {
		this.restTemplate = restTemplate;
		this.environment = environment;
	}

	@GetMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
	public GreetingResponse greetingGet() {
		
		ResponseEntity<TextResponse> textResponseEntity = restTemplate.getForEntity("http://localhost:9090/", TextResponse.class);
		TextResponse textResponse = textResponseEntity.getBody();		
		String port = environment.getProperty("local.server.port");
		
		return new GreetingResponse(
				textResponse.getText(), 
				port, 
				VERSION, 
				textResponse.getPort(), 
				textResponse.getVersion());
		
	}	
	
}