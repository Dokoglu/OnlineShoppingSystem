package com.onlineshopping.demo.service;

import com.onlineshopping.demo.controllers.model.LoginBody;
import com.onlineshopping.demo.entities.Customer;

public interface LoginService {

	Customer login(LoginBody loginBody);
}
