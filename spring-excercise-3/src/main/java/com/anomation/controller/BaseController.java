package com.anomation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class BaseController {
	public String index() {
		return "index";
	}
}
