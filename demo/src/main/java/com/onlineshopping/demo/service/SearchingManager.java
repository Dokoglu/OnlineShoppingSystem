package com.onlineshopping.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onlineshopping.demo.entities.Product;

@Service
public class SearchingManager implements SearchingService {

	
	private final ProductService productService;
	

	public SearchingManager(ProductService productService) {
		this.productService = productService;
	}


	@Override
	public List<Product> findByWord(String word) {

		return productService.findNameContainingIgnoreCase(word);
	}
}