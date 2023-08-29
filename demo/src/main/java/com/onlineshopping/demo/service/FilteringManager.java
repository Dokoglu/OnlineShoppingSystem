package com.onlineshopping.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onlineshopping.demo.entities.Product;

@Service
public class FilteringManager implements FilteringService {


	private final ProductService productService;
	

	public FilteringManager(ProductService productService) {
		this.productService = productService;
	}


	@Override
	public List<Product> listByCategory(int categoryID) {
		return productService.getByCategoryID(categoryID);
	}

}
