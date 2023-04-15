package com.gcu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Creates the Index Controller
 * @author connorrolstad
 *
 */
@Controller
@RequestMapping("/")
public class IndexController {

	Logger logger = LoggerFactory.getLogger(IndexController.class);
	/**
	 * Method for displaying the Welcome Page 
	 * @return index.html
	 */
	@GetMapping("/")
	public String display() {
		logger.trace("IndexController Display");
		return "index";
	}
}
