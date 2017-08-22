package com.undemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example4")
public class Example4Controller {

	public static final String TEMPLATE_ERROR_VIEW = "404";

	@GetMapping("/error")
	public String exampleString(Model model) {
		return TEMPLATE_ERROR_VIEW;

	}
}
