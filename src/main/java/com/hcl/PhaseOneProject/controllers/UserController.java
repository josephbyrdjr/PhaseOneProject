package com.hcl.PhaseOneProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import com.hcl.PhaseOneProject.model.*;
import com.hcl.PhaseOneProject.service.*;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String displayHome(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); // get logged in username
        model.addAttribute("username", name);
        return "home";
    }

    @GetMapping("/register")
    public String showRegisterForm() {
        return "userRegistration";
    }

    @PostMapping("/register")
    public String grabDisplayData(@RequestParam String username, @RequestParam Long userId, @RequestParam String pwd,
                                  Model model) {
        User user = new User(userId, username, pwd);
        userService.insertUser(user);
        model.addAttribute("msg", "New User Added");
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("errorMsg", "Your username and password are invalid.");
        if (logout != null)
            model.addAttribute("msg", "You have been logged out successfully.");
        return "login";
    }


}