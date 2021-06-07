package com.anomation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/test1")
	@ResponseBody
	public String test1() {
		return "test1";
	}
	
	@RequestMapping("/test2")
	@ResponseBody
	public String test2() {
		return "test2";
	}
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
}
