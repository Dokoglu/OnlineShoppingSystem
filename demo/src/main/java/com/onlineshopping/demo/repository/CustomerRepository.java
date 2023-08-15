package com.onlineshopping.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.onlineshopping.demo.entities.Customer;

@EnableJpaRepositories
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	//@Query("from customer where e_mail=:e_mail and password=:password")
    Customer findByEMail(String e_mail,String password);

	
}
