package com.gcu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gcu.model.CredentialsModel;
/**
 * Creates the Login Controller
 * @author connorrolstad
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    
	Logger logger = LoggerFactory.getLogger(LoginController.class);
	/**
	 * Method to display the Login Form
	 * @param model passed in
	 * @return login.html
	 */
	@GetMapping("/")
	public String display(Model model) {
		logger.trace("LoginController Display");
		model.addAttribute("title", "Login Form");
		model.addAttribute("credentialsModel", new CredentialsModel());
		return "login";
	}
}
