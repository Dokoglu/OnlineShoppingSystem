package com.onlineshopping.demo.service;

import com.onlineshopping.demo.dto.CreateProductRequest;

public interface ProductService {

	public void add(CreateProductRequest createProductRequest);
	public void delete(int id);
	public void update(CreateProductRequest createProductRequest, int id);
	
	
	
	
}
