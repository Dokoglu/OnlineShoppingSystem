package com.onlineshopping.demo.service;

import org.springframework.stereotype.Service;

import com.onlineshopping.demo.controllers.model.RegistrationBody;
import com.onlineshopping.demo.entities.Customer;
import com.onlineshopping.demo.repository.CustomerRepository;
@Service
public class RegistrationManager implements RegistrationService{

	
	private final CustomerRepository customerRepository;
	
	public RegistrationManager(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}


	@Override
	public void register(RegistrationBody registrationBody) {
		
	//	User user = new User();
	//	user.setType(registrationBody.getType());
		
		//()
		if((registrationBody.getType()).equals("Customer")) {
			Customer customer = new Customer();
			customer.seteMail(registrationBody.getEmail());
			customer.setName(registrationBody.getName());
			customer.setSurname(registrationBody.getSurname());
			customer.setPassword(registrationBody.getPassword());
			
			this.customerRepository.save(customer);
		}
		
		else {
			//ileride seller eklenirse dolacak
		}
			
	}

	
}
