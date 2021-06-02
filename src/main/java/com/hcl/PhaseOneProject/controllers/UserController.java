package com.hcl.PhaseOneProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	
	
	

}
