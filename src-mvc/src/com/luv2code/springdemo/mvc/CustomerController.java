package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processFor(@Valid @ModelAttribute("customer") Customer customer,
			BindingResult bindingResult) {
		
		System.out.println("The binding result " + bindingResult); //bindingResult will display model,field in which error is coming
		//also in codes it indicates the properties it look for in spring so as to display error message, so you can use any one of the property in your property file to add custom message
		
		
		if(bindingResult.hasErrors()) {
	
			return "customer-form";
		}
		System.out.println(customer.getLastname());
		return "customerConfirmation";
	}

}
