package com.onlineshopping.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.entities.Product;
import com.onlineshopping.demo.entities.ShoppingCard;
import com.onlineshopping.demo.repository.ShoppingCardRepository;
@Service
public class ShoppingCardManager implements ShoppingCardService {

	@Autowired
	private ShoppingCardRepository shoppingCardRepository;

	@Override
	public void addProduct(int productID) {
		Product product = new Product();
		shoppingCardRepository.save(product.getProductID());

	}

	@Override
	public void deleteProduct(int productID) {
		shoppingCardRepository.deleteById(productID);

	}

	@Override
	public Optional<ShoppingCard> getAll(int id) {
		Optional<ShoppingCard> shoppingCard = Optional.ofNullable(this.shoppingCardRepository.findById(id).get());
		return shoppingCard;
	}

}
