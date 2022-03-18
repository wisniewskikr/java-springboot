package com.example.controllers.init;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InitController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String greeting() {		
		return "redirect:greeting";
	}
	
}