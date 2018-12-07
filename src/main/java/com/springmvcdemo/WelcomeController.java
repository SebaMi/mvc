package com.springmvcdemo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class WelcomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(Model model) {
		model.addAttribute("messageHola","Hello Spring MVC");
		
		return "hola_mundo"; 
	}

	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String profile(Model model) {
		return "";
	}
	
	@RequestMapping("/user")
	public String newUser(Model model){
	  model.addAttribute("user", new User());
	  return "userForm";
	}
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)  
	public String addUser(@Valid @ModelAttribute("user") User user, BindingResult results) { 
		if(results.hasErrors()) 	return "userForm";
		else return "result";
	}
}
