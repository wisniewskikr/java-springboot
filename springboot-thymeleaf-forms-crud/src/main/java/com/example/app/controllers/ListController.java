package com.example.app.controllers;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.app.commands.ListCommand;
import com.example.app.repositories.UserRepository;


@Controller
public class ListController {
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String displayPage(@ModelAttribute("command")ListCommand command) {		
		command.setUsers(userRepository.findAll());
		return "list";		
	}
	
	@RequestMapping(value="/list", method = RequestMethod.POST, params = "create")
	public String handleCreate(@ModelAttribute("command")ListCommand command) {		
		return "redirect:create";		
	}
	
	@RequestMapping(value="/list", method = RequestMethod.POST, params = "view")
	public String handleView(@ModelAttribute("command")ListCommand command,
			HttpSession session) {
		session.setAttribute("selectedUserId", command.getSelectedUserId());
		return "redirect:view";		
	}
	
	@RequestMapping(value="/list", method = RequestMethod.POST, params = "edit")
	public String handleEdit(@ModelAttribute("command")ListCommand command,
			HttpSession session) {	
		session.setAttribute("selectedUserId", command.getSelectedUserId());
		return "redirect:edit";		
	}
	
	@RequestMapping(value="/list", method = RequestMethod.POST, params = "delete")
	public String handleDelete(@ModelAttribute("command")ListCommand command,
			HttpSession session) {
		session.setAttribute("selectedUserId", command.getSelectedUserId());
		return "redirect:delete";		
	}

}