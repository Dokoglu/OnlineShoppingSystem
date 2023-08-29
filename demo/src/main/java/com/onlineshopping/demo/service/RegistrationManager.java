package com.onlineshopping.demo.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.controllers.model.RegistrationBody;
import com.onlineshopping.demo.entities.Customer;
@Service
public class RegistrationManager implements RegistrationService{

	
	private final CustomerService customerService;
	private final ModelMapper modelMapper;
	
	public RegistrationManager(CustomerService customerService,ModelMapper modelMapper) {
		this.customerService = customerService;
		this.modelMapper=modelMapper;
	}


	@Override
	public void register(RegistrationBody registrationBody) {
		
	//	User user = new User();
	//	user.setType(registrationBody.getType());
		
		//()
		if((registrationBody.getType()).equals("Customer")) {
			Customer customer = modelMapper.map(registrationBody, Customer.class);
			this.customerService.save(customer);
		}
		
		else {
			//ileride seller eklenirse dolacak
		}
			
	}

	
}
