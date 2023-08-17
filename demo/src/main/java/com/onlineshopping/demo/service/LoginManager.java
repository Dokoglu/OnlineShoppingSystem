package com.onlineshopping.demo.service;

import java.util.Optional;

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
	public Optional<Customer> login(LoginBody loginBody) {
		try {
			Customer cust = new Customer();
			cust.seteMail(loginBody.getEmail());
			cust.setPassword(loginBody.getPassword());
			Optional<Customer> customer =this.customerRepository.findByEmailAndPassword(cust.geteMail(), cust.getPassword());
				return customer;
		}
		catch (Exception e) {
			return null; // Not Found
	}
	}	

}
