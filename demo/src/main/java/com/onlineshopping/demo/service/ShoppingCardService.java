package com.onlineshopping.demo.service;

import java.util.Optional;

import com.onlineshopping.demo.dto.CreateShoppingCardRequest;
import com.onlineshopping.demo.entities.ShoppingCard;

public interface ShoppingCardService {
	
	void createShoppingCard(CreateShoppingCardRequest shoppingCardRequest);
	Optional<ShoppingCard> getAll(int id);

}
