package com.onlineshopping.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.onlineshopping.demo.entities.Customer;

@EnableJpaRepositories
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	Optional <Customer> findByEmailAndPassword(String e_mail, String password);
	}
