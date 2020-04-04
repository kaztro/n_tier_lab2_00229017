package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.User;

@Controller
public class MainController {
	@GetMapping("/addUser")
	public String sendForm(User user) { return "addUser"; }
	
	@PostMapping("/addUser")
	public String processForm(User user) {
		return "showMessage";
	}
	
}
