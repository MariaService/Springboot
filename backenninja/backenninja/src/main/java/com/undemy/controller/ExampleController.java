package com.undemy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Person;
import com.undemy.component.exampleComponent;

@Controller
@RequestMapping("example")
public class ExampleController {
	static final String EXAMPLE_VIEW ="example";
	
	@Autowired
	@Qualifier("exampleComponent")
	private exampleComponent exampleComponent;
		
	//primera forma
//	@RequestMapping(value="/exampleString",method =RequestMethod.GET)
	@GetMapping("/exampleString")
	public String exampleString(Model model) {
		//model.addAttribute(new Person("carlos", 32));
		model.addAttribute("people",getPerson());
		exampleComponent.sayHello();
		
		return EXAMPLE_VIEW;
	}
	//segunda forma
	@RequestMapping(value="/exampleMAV",method =RequestMethod.GET)
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		//mav.addObject("name", "charly");
		//mav.addObject(new Person("charly", 21));
		mav.addObject("people", getPerson());

		return mav;
	}
	
	//lista de personqa
	private List<Person> getPerson(){

	List<Person> people = new ArrayList<>();
	people.add(new Person("carlos", 18));
	people.add(new Person("juanito", 18));
	people.add(new Person("mario", 18));
	people.add(new Person("luis", 18));
	people.add(new Person("carmelo", 18));
	
	return people;
	}
	
	
}
