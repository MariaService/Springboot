package com.undemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.model.Person;

@Controller
@RequestMapping("/example3")
public class Example3Controller {

	public static final String FORM_VIEW = "form";
	public static final String RESULT_VIEW = "result";
	//#1
//	@GetMapping("/")
//	public String redirect() {
//		return "redirect:/example3/showform";
//	}
//	
	
	//#segunda forma Redirict
	@GetMapping("/")
	public RedirectView redirect() {
		return new RedirectView("/showform");
	}
	
	//http://localhost:8080/example3/showform
	@GetMapping("/showform")
	public String ShowForm(Model model) {
		model.addAttribute("person", new Person());
		return FORM_VIEW;
	}

	@PostMapping("/addperson")
	public ModelAndView addPerson(@ModelAttribute("person") Person person) {
		ModelAndView mav = new ModelAndView(RESULT_VIEW);
		mav.addObject("person",person);
		return mav;
	}
}