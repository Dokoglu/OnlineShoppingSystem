package com.onlineshopping.demo.service;

import com.onlineshopping.demo.dto.CreateCustomerRequest;

public interface CustomerService {  
	
	void add(CreateCustomerRequest createCustomerRequest);
	void delete(int id);
	void getAll();
	void update(CreateCustomerRequest createCustomerRequest, int id);

}
