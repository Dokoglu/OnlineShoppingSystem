package com.onlineshopping.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.onlineshopping.demo.businessRules.CategoryBusinessRules;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreateCategoryRequest;
import com.onlineshopping.demo.dto.GetAllCategoryResponse;
import com.onlineshopping.demo.dto.GetByIdCategoryResponse;
import com.onlineshopping.demo.entities.Category;
import com.onlineshopping.demo.repository.CategoryRepository;


@Service
public class CategoryManager implements CategoryDao{
	

	private final CategoryRepository categoryRepository;
	private final ModelMapper modelMapper;

	private CategoryBusinessRules categoryBusinessRules;

	public CategoryManager(CategoryRepository categoryRepository, ModelMapper modelMapper) {
		this.categoryRepository = categoryRepository;
		this.modelMapper=modelMapper;
	}

	@Override
	public void add(CreateCategoryRequest createCategoryRequest) {

		// TODO Auto-generated method stub
		this.categoryBusinessRules.checkIfCategoryExists(createCategoryRequest.getId());

		Category category =modelMapper.map(createCategoryRequest, Category.class);
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
		Category category=this.categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Couldn't find by id" + id));
		response.setName(category.getName());
		
		return response;
	}


	

	

}
