package com.onlineshopping.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineshopping.demo.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Integer,Product>{
	
	

}
