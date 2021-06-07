package com.anomation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anomation.model.EmployeeModel;

@Controller("ControllerOfExcercise1")
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String addEmployee(Model model) {
		model.addAttribute("employee", new EmployeeModel());
		return "add-employee";
	}
	@RequestMapping(value = "add-employee", method = RequestMethod.POST)
	public String showEmployee(@ModelAttribute("employee") EmployeeModel model, ModelMap modelMap) {
		model.setName(model.getName().toUpperCase());
		modelMap.addAttribute("employee", model);
		return "index";
	}
}
