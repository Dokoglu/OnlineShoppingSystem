package com.onlineshopping.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.onlineshopping.demo.entities.ShoppingCard;
@Service
public interface ShoppingCardService {
	
	void addProduct(int productID);
	void deleteProduct(int productID);
	Optional<ShoppingCard> getAll(int id);

}
