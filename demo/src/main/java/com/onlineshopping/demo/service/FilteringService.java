package com.onlineshopping.demo.service;

import java.util.List;

import com.onlineshopping.demo.entities.Product;

public interface FilteringService {
	
	 public List<Product> listByCategory(int categoryID);

}
