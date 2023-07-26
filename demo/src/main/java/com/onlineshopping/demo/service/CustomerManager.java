package com.onlineshopping.demo.service;

import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreateCustomerRequest;
import com.onlineshopping.demo.entities.Customer;
import com.onlineshopping.demo.repository.CustomerRepository;

@Service
public class CustomerManager implements CustomerService{
	
	private CustomerRepository customerRepository;

	@Override
	public void add(CreateCustomerRequest createCustomerRequest) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		CreateCustomerRequest customerRequest=new CreateCustomerRequest();
		customer.setId(customerRequest.getId());
		customer.setName(customerRequest.getName());
		customer.setSurname(customerRequest.getSurname());
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
		CreateCustomerRequest customerRequest=new CreateCustomerRequest();
		customer.setName(customerRequest.getName());
		customer.setSurname(customer.getSurname());
		this.customerRepository.save(customer);
		
		
		
	}

}
