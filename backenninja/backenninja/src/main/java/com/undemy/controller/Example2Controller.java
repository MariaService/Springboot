package com.undemy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class Example2Controller {
  
	private static final String EXAMLE2_VIEW="example2";
	//http://localhost:8080/example2/request1?nm=carlos
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam (name="nm",required=false,defaultValue="null") String name) {
		ModelAndView mav = new ModelAndView(EXAMLE2_VIEW);
		//Datos name
		mav.addObject("mn_in_model", name);
		//Datos age
		return mav;
	}
	
	
	//segunda forma peticion get
	//http://localhost:8080/example2/request2/saul
	@GetMapping("/request2/{nm}")
	public ModelAndView request2(@PathVariable("nm") String name) {
		ModelAndView mav = new ModelAndView(EXAMLE2_VIEW);
		mav.addObject("mn_in_model", name);
		return mav;
	}
}
