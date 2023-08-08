package com.onlineshopping.demo.service;

import java.util.List;

import com.onlineshopping.demo.entities.Product;

public interface ShoppingCardService {
	
	void addProduct(int productID);
	void deleteProduct(int productID);
	List<Product> getAll();

}
