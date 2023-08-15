package com.onlineshopping.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.demo.controllers.model.LoginBody;
import com.onlineshopping.demo.entities.Customer;
import com.onlineshopping.demo.service.LoginService;

@RestController
@RequestMapping("/Login")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@GetMapping("/getcustomer")
	public Customer login(@RequestBody LoginBody loginBody) {
		
		return loginService.login(loginBody);
		
	}
	
}
