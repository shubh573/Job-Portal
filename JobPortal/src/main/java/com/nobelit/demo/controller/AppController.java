package com.nobelit.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingErrorProcessor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nobelit.demo.model.User;

@Controller
public class AppController {

	
	@RequestMapping("/welcome")

		public String Welcome() {
		return "homepage";
	}
	
	@RequestMapping("/register")
	public String registration() {
		return "newUserReg";
	}
	
	@PostMapping("/saveUser")
	public String registerUser() {
		return "homepage";
	}
}
