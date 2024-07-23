package com.onlineshopping.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.controllers.model.LoginBody;
import com.onlineshopping.demo.entities.Customer;
import com.onlineshopping.demo.repository.CustomerRepository;

@Service
public class LoginManager implements LoginService {

	private final CustomerRepository customerRepository;

	public LoginManager(CustomerRepository customerRepository) {

		this.customerRepository = customerRepository;
	}

	@Override
	public Customer login(LoginBody loginBody) {

		List<Customer> custList = this.customerRepository.findAll();
		for (Customer c : custList) {
			if (c.getE_mail().equals(loginBody.getEmail())
					&& c.getPassword().equals(loginBody.getPassword()))
				return c;
		}
		return null;
	}

}
