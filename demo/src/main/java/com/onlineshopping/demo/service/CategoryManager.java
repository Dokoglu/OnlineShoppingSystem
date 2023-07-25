package com.onlineshopping.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.entities.Category;
import com.onlineshopping.demo.repository.CategoryRepository;

@Service
public class CategoryManager implements CategoryDao{
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
	
		
	}

	@Override
	public void view(Category category) {
		// TODO Auto-generated method stub
		
	}

}
