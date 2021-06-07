package com.anomation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anomation.model.EmployeeModel;

@Controller("ControllerOfEmployee")
public class ExcerciseController {
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String addEmployee(Model model) {
		model.addAttribute("employee", new EmployeeModel());
		
		List<String> listFavorite = new ArrayList<String>();
		listFavorite.add("Swimming");
		listFavorite.add("Listening music");
		listFavorite.add("Walking");
		listFavorite.add("Watching movie");
		listFavorite.add("Reading comic");
		model.addAttribute("listFavorite", listFavorite);
		
		List<String> listPosition = new ArrayList<String>();
		listPosition.add("Developer");
		listPosition.add("Designer");
		listPosition.add("Tester");
		listPosition.add("QA");
		model.addAttribute("listPosition", listPosition);
		
		return "employee/insert";
	}
	@RequestMapping(value = "/show", method = RequestMethod.POST)
	public String showEmployee(@ModelAttribute("employee") EmployeeModel employeeModel, ModelMap modelMap) {
		modelMap.addAttribute("employee", employeeModel);
		return "employee/show";
	}
}
