package com.onlineshopping.demo.service;

import java.util.Optional;

import com.onlineshopping.demo.controllers.model.LoginBody;
import com.onlineshopping.demo.entities.Customer;

public interface LoginService {

	Optional<Customer> login(LoginBody loginBody);
}
