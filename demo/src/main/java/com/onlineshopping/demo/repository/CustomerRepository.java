package com.onlineshopping.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineshopping.demo.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
