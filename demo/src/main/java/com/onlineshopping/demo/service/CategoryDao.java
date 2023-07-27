package com.onlineshopping.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreateCategoryRequest;
import com.onlineshopping.demo.dto.GetAllCategoryResponse;
import com.onlineshopping.demo.entities.Category;

@Service
public interface CategoryDao {
	
	void add(CreateCategoryRequest createCategoryRequest);
	
	List<GetAllCategoryResponse> getAllResponse();

}
