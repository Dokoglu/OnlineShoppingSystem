package com.onlineshopping.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreateCategoryRequest;
import com.onlineshopping.demo.entities.Category;
import com.onlineshopping.demo.repository.CategoryRepository;

@Component
@Service
public class CategoryManager implements CategoryDao{
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void add(CreateCategoryRequest createCategoryRequest) {
		// TODO Auto-generated method stub
		Category category =new Category();
		CreateCategoryRequest categoryRequest=new CreateCategoryRequest();
		category.setId(categoryRequest.getId());
		category.setName(categoryRequest.getName());
		this.categoryRepository.save(category);
	
		
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	

}
