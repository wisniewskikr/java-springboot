package com.example.controllers.greeting;

import java.io.InputStream;
import java.util.Properties;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String CONFIGS_PROPERTIES_PATH = "configs/greeting.properties";

	@RequestMapping(value="/")
	public String greeting() {
		Properties props = getPropertiesFromConfig();
		String message = props.getProperty("message") != null ? props.getProperty("message") : "Can not read message from configuration!";
		return message;		
	}
	
	private Properties getPropertiesFromConfig() {
		
		Properties properties = new Properties();
		
		try {
			InputStream stream = this.getClass().getClassLoader().getResourceAsStream(CONFIGS_PROPERTIES_PATH);
			properties.load(stream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return properties;
		
	}
	
}