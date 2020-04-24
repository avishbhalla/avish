package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	//need a controller method to show the form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld-form";
	}
	
	//need a controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	//new controller method to read form data and add data to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		//read the request parameter from the HTML form
		String name = request.getParameter("studentName");
		
		//convert the data to upper case
		name = name.toUpperCase();
		
		//create the message 
		String result = "Yo! " + name;
		
		//add the message to the model
		model.addAttribute("message", result);
		return "helloWorld";
}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String name, Model model) {
		
		name = name.toUpperCase();
		String result = "Yo! Hey my friend" + name;
		model.addAttribute("message", result);
		
		return "helloWorld";
	}
	
}
