package com.anomation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping("/method0")
	public String method0() {
		return "page0";
	}
	@RequestMapping("/method1")
	public String method1() {
		return "page2";
	}
	@RequestMapping(value = {"/","home"})
	public String home() {
		return "home";
	}
	@RequestMapping(value = "test",method = RequestMethod.GET)
	public String doGet() {
		return "test1";
	}
	@RequestMapping(value = "test1",method = RequestMethod.POST)
	public String doPost() {
		return "test2";
	}
}
