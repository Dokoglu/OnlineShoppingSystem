package com.onlineshopping.demo.service;

import java.util.List;

import com.onlineshopping.demo.dto.CreateCategoryRequest;
import com.onlineshopping.demo.entities.Category;

public interface CategoryDao {
	
	void add(CreateCategoryRequest createCategoryRequest);
	List<Category> getAll();

}
