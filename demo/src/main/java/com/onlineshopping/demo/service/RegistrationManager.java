package com.onlineshopping.demo.service;

import com.onlineshopping.demo.utilities.mappers.ModelMapperManager;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.controllers.model.RegistrationBody;
import com.onlineshopping.demo.entities.Customer;
@Service
public class RegistrationManager implements RegistrationService{

	
	private final CustomerService customerService;
	private final ModelMapperManager modelMapperManager;
	
	public RegistrationManager(CustomerService customerService,ModelMapperManager modelMapperManager) {
		this.customerService = customerService;
		this.modelMapperManager=modelMapperManager;
	}


	@Override
	public void register(RegistrationBody registrationBody) {
		
	//	User user = new User();
	//	user.setType(registrationBody.getType());
		
		//()
		if((registrationBody.getType()).equals("Customer")) {
			Customer customer = modelMapperManager.forRequest().map(registrationBody, Customer.class);
			this.customerService.save(customer);
		}
		
		else {
			//ileride seller eklenirse dolacak
		}
			
	}

	
}
