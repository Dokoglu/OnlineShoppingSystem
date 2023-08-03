package com.onlineshopping.demo.service;

import com.onlineshopping.demo.entities.Customer;
import com.onlineshopping.demo.entities.RegistrationBody;
import com.onlineshopping.demo.entities.User;
import com.onlineshopping.demo.repository.CustomerRepository;

public class RegistrationManager implements RegistrationService{

	private CustomerRepository customerRepository;
	
	@Override
	public void register(RegistrationBody registrationBody) {
		
		User user = new User();
		user.setType(registrationBody.getType());
		
		if(user.getType().equals("Customer")) {
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
