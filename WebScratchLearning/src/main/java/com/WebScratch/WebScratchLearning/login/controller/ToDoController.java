package com.WebScratch.WebScratchLearning.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.WebScratch.WebScratchLearning.validation.ToDoService;


@Controller
@SessionAttributes("name")
public class ToDoController {
	@Autowired
	ToDoService service;
	
	@RequestMapping(value="/to-do", method = RequestMethod.GET)
	public String showToDoList(ModelMap model){
		String name = (String) model.get("name");
		model.put("todos", service.retrieveTodos(name));
		return "todolist";
	}
	

}
