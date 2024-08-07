package com.onlineshopping.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineshopping.demo.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

		boolean checkIfCustomerExist(String email);
	
	}
