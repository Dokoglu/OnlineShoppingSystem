package com.onlineshopping.demo.service;

import java.util.Optional;

import com.onlineshopping.demo.entities.ShoppingCard;

public interface ShoppingCardService {
	
	void addProduct(int productID);
	void deleteProduct(int productID);
	Optional<ShoppingCard> getAll(int id);

}
