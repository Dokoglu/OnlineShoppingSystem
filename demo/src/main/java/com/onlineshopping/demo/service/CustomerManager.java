package com.onlineshopping.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreateCustomerRequest;
import com.onlineshopping.demo.entities.Customer;
import com.onlineshopping.demo.repository.CustomerRepository;


@Service
public class CustomerManager implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void add(CreateCustomerRequest createCustomerRequest) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setId(createCustomerRequest.getId());
		customer.setName(createCustomerRequest.getName());
		customer.setSurname(createCustomerRequest.getSurname());
		this.customerRepository.save(customer);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
		this.customerRepository.deleteById(id);
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		this.customerRepository.findAll();
		
	}

	@Override
	public void update(CreateCustomerRequest createCustomerRequest, int id) {
		// TODO Auto-generated method stub
		
		Customer customer=this.customerRepository.findById(id).get();
		
		customer.setName(createCustomerRequest.getName());
		customer.setSurname(createCustomerRequest.getSurname());
		this.customerRepository.save(customer);
		
		
		
	}

}
