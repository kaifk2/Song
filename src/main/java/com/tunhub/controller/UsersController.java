package com.tunhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tunhub.entities.Users;
import com.tunhub.services.UsersService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UsersController {
	 @Autowired
	   UsersService service;

	   public UsersController() {
	   }

	   @PostMapping({"/register"})
	   public String addUsers(@ModelAttribute Users user) {
	      boolean userStatus = this.service.emailExists(user.getEmail());
	      if (!userStatus) {
	         this.service.addUser(user);
	         System.out.println("user added");
	      } else {
	         System.out.println("user already exists");
	      }

	      return "home";
	   }

	   @PostMapping({"/validate"})
	   public String validate(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session, Model model) {
	       if (this.service.validateUser(email, password)) {
	           String role = this.service.getRole(email);

	            session.setAttribute("email", email);
	            if(role.equals("admin")) {
	            	return "adminHome";
	            }else {
	            	Users user = service.getUser(email);
	            	boolean userStatus = user.isPremium();
	            	model.addAttribute("isPrmine", user);
	            	return "customerhome";
	            	
	            }
	       }else {
	    		return "login";
	       }
	       
	   }
	   @GetMapping({"/logout"})
	   public String logout(HttpSession session) {
	      session.invalidate();
	      return "login";
	   }

}
