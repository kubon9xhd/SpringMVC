package com.anomation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home/{id}")
	public String home(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id);
		return "home";
	}
	@RequestMapping("/home")
	public ModelAndView home1(@RequestParam("id") int id, @RequestParam("username") String username) {
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("id", id);
		modelAndView.addObject("username", username);
		return modelAndView;
		
	}
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
