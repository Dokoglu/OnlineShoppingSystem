package com.onlineshopping.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.controllers.model.LoginBody;
import com.onlineshopping.demo.entities.Customer;
import com.onlineshopping.demo.repository.CustomerRepository;

@Service
public class LoginManager implements LoginService {
	@Autowired
	private final CustomerRepository customerRepository;

	public LoginManager(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer login(LoginBody loginBody) {
		Customer cust = customerRepository.findByEMail(loginBody.getEmail(), loginBody.getPassword());

		if (cust.getId() >= 0 && cust.geteMail() != null)
			return cust;
		else
			return null;

	}

}
