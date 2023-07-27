package com.onlineshopping.demo.service;

import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreateCustomerRequest;

@Service
public interface CustomerService {  
	
	void add(CreateCustomerRequest createCustomerRequest);
	void delete(int id);
	void getAll();
	void update(CreateCustomerRequest createCustomerRequest, int id);

}
