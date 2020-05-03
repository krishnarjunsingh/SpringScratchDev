package com.WebScratch.WebScratchLearning.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.WebScratch.WebScratchLearning.validation.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginMessage(ModelMap model) {
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showWelcomepage(ModelMap model, @RequestParam String userName, @RequestParam String password) {
		boolean isValidUser = loginService.validateUser(userName, password);
		if(!isValidUser) {
			model.put("errorMessage", "InvalidCredential");
			return "login";
		}
		model.put("name", userName);
		model.put("password", password);
		return "welcome";
	}
}
