package com.test.spring.boot;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	@RequestMapping("/register")
	public String registerForm() {
		return "CustomerData";
	}

}
