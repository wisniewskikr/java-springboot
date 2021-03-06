package com.example.controllers.greeting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.commands.greeting.GreetingCommand;


@Controller
@RequestMapping(value="/")
public class GreetingController {

	@RequestMapping(method = RequestMethod.GET)
	public String display(@ModelAttribute("command") GreetingCommand command) {
		return "greeting/greeting";		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String handleSubmit(
			@ModelAttribute("command") GreetingCommand command) {
				
		command.setMessage(String.format("Hello World %s!", command.getName()));
		command.setName(null);
		return "greeting/greeting";
		
	}
	
}