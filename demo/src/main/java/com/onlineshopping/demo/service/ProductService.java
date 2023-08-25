package com.onlineshopping.demo.service;

import java.util.List;

import com.onlineshopping.demo.dto.CreateProductRequest;
import com.onlineshopping.demo.dto.GetAllProductResponse;
import com.onlineshopping.demo.dto.GetByIdProductResponse;
import com.onlineshopping.demo.entities.Product;

public interface ProductService {

	public void add(CreateProductRequest createProductRequest);

	public void delete(int id);

	public void update(CreateProductRequest createProductRequest, int id);

	public GetByIdProductResponse getById(int id);

	public List<GetAllProductResponse> getAll();

	public List<Product> findAll();

	public List<Product> getByCategoryID(int id);

	public List<Product> findNameContainingIgnoreCase(String word);

}
