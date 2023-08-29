package com.onlineshopping.demo.service;

import com.onlineshopping.demo.dto.CreateCustomerRequest;
import com.onlineshopping.demo.entities.Customer;


public interface CustomerService {  
	
	void add(CreateCustomerRequest createCustomerRequest);
	void delete(int id);
	void getAll();
	void update(CreateCustomerRequest createCustomerRequest, int id);
	void save(Customer customer);

}
