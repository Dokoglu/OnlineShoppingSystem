package com.onlineshopping.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreateCategoryRequest;
import com.onlineshopping.demo.dto.GetAllCategoryResponse;
import com.onlineshopping.demo.dto.GetByIdCategoryResponse;
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
	public List<GetAllCategoryResponse> getAllResponse() {
		// TODO Auto-generated method stub
		List<GetAllCategoryResponse> categoryResponse=new ArrayList<GetAllCategoryResponse>();
		List<Category> category=categoryRepository.findAll();
		for(Category ct: category) {
			GetAllCategoryResponse responseItem=new GetAllCategoryResponse();
			responseItem.setName(ct.getName());
			categoryResponse.add(responseItem);
		}
		return categoryResponse;
	}

	@Override
	public GetByIdCategoryResponse getById(int id) {
		// TODO Auto-generated method stub
		GetByIdCategoryResponse response=new GetByIdCategoryResponse();
		Category category=this.categoryRepository.findById(id).orElseThrow();
		response.setName(category.getName());
		
		return response;
	}


	

	

}
