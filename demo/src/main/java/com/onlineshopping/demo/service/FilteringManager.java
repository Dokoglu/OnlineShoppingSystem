package com.onlineshopping.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.entities.Product;

@Service
public class FilteringManager implements FilteringService {

	@Autowired
	private ProductService productService;

	@Override
	public List<Product> listByCategory(int categoryID) {
		return productService.getByCategoryID(categoryID);
	}

}
