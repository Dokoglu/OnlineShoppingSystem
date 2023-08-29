package com.onlineshopping.demo.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreateCustomerRequest;
import com.onlineshopping.demo.entities.Customer;
import com.onlineshopping.demo.repository.CustomerRepository;


@Service
public class CustomerManager implements CustomerService{
	
	
	private final CustomerRepository customerRepository;
	private final ModelMapper modelMapper;
	
	
	public CustomerManager(CustomerRepository customerRepository, ModelMapper modelMapper) {
		this.customerRepository = customerRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public void add(CreateCustomerRequest createCustomerRequest) {

		Customer customer=modelMapper.map(createCustomerRequest,Customer.class);
		this.customerRepository.save(customer);		
	}

	@Override
	public void delete(int id) {
		this.customerRepository.deleteById(id);
	}

	@Override
	public void getAll() {
		this.customerRepository.findAll();		
	}

	@Override
	public void update(CreateCustomerRequest createCustomerRequest, int id) {
		
		Customer customer=this.customerRepository.findById(id).get();
		
		customer.setName(createCustomerRequest.getName());
		customer.setSurname(createCustomerRequest.getSurname());
		this.customerRepository.save(customer);	
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		
	}

}
