package com.onlineshopping.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreateProductRequest;
import com.onlineshopping.demo.dto.GetAllProductResponse;
import com.onlineshopping.demo.dto.GetByIdProductResponse;
import com.onlineshopping.demo.entities.Product;
import com.onlineshopping.demo.repository.ProductRepository;


@Service
public class ProductManager implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public void add(CreateProductRequest createProductRequest) {
		CreateProductRequest productRequest = new CreateProductRequest();
		Product product = new Product();
		product.setProductID(productRequest.getId());
		product.setDescription(productRequest.getDescription());
		product.setCategoryID(productRequest.getCategoryID());
		product.setProductName(productRequest.getName());
		product.setPrice(productRequest.getPrice());
			
		this.productRepository.save(product);
	}

	public void delete(int id) {
		this.productRepository.deleteById(id);
	}

	public void update(CreateProductRequest createProductRequest, int id) {
		CreateProductRequest productRequest = new CreateProductRequest();
		Product product = productRepository.findById(id).orElseThrow();
		product.setCategoryID(productRequest.getCategoryID());
		product.setPrice(productRequest.getPrice());
		product.setProductName(productRequest.getName());
		
		this.productRepository.save(product);
	}

	@Override
	public GetByIdProductResponse getById(int id) {
		Product product = productRepository.findById(id).orElseThrow();
		GetByIdProductResponse productResponse = new GetByIdProductResponse();
		productResponse.setProductName(product.getProductName());
		productResponse.setProductPrice(product.getPrice());
			
		return productResponse;
	}

	@Override
	public List<GetAllProductResponse> getAll() {
		List<Product> products = productRepository.findAll();
		List<GetAllProductResponse> productResponse = new ArrayList<GetAllProductResponse>();
		for(Product p : products) {
			GetAllProductResponse responseItem = new GetAllProductResponse();
			responseItem.setName(p.getProductName());
			responseItem.setPrice(p.getPrice());
			productResponse.add(responseItem);
		}
		
		return productResponse;
	}
	
	

}
