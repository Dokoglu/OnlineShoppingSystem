package com.onlineshopping.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineshopping.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer > {

	
}
