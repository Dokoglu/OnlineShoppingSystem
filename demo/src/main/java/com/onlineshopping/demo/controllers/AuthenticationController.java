package com.onlineshopping.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.demo.controllers.model.RegistrationBody;
import com.onlineshopping.demo.service.RegistrationService;

@RestController
@RequestMapping("/authentication")
public class AuthenticationController {
	

	private final RegistrationService registrationService;

    public AuthenticationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/register")
	public void register(@RequestBody RegistrationBody registrationBody) {
		registrationService.register(registrationBody);
	}

}
