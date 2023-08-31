package com.onlineshopping.demo.service;

import java.util.Optional;

import com.onlineshopping.demo.dto.CreateShoppingCardRequest;
import com.onlineshopping.demo.entities.ShoppingCard;

public interface ShoppingCardService {
	
	void addProduct(CreateShoppingCardRequest shoppingCardRequest);
	void deleteProduct(int productID);
	void update(CreateShoppingCardRequest shoppingCardRequest, int customerID);
	Optional<ShoppingCard> getAll(int id);

}
