package com.hcl.PhaseOneProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.PhaseOneProject.model.*;
import com.hcl.PhaseOneProject.service.*;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
//	@GetMapping("/login")
//	public ModelAndView login() {
//
//		return new ModelAndView("login");
//	}
@RequestMapping(value = "/login", method = RequestMethod.GET)
public String login(Model model, String error, String logout) {
	if (error != null)
		model.addAttribute("errorMsg", "Your username and password are invalid.");

	if (logout != null)
		model.addAttribute("msg", "You have been logged out successfully.");

	return "login";
}
	

}
