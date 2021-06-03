package com.hcl.PhaseOneProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.PhaseOneProject.model.*;
import com.hcl.PhaseOneProject.service.*;

import ch.qos.logback.core.net.SyslogOutputStream;


@Controller
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/register")
	public String showRegisterForm() {
		return "userRegistration";
	}
	
	@PostMapping("/register")
	public String grabDisplayData( @RequestParam String username, @RequestParam Long userId, 
								   @RequestParam String pwd, Model model) {
		User user = new User(userId, username, pwd, "USER");
		userService.insertUser(user); 
		System.out.println(user.toString());

		return "login";
		
	}

	@GetMapping(value = "/login")
	public String login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("errorMsg", "Your username and password are invalid.");

		if (logout != null)
			model.addAttribute("msg", "You have been logged out successfully.");

		return "login";
	}
	
	

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String userlogin(Model model, String error, String logout) {

		return "home";
	}

}
