package com.onlineshopping.demo.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreateShoppingCardRequest;
import com.onlineshopping.demo.entities.Customer;
import com.onlineshopping.demo.entities.Product;
import com.onlineshopping.demo.entities.ShoppingCard;
import com.onlineshopping.demo.repository.ShoppingCardRepository;
@Service
public class ShoppingCardManager implements ShoppingCardService {

	private final ShoppingCardRepository shoppingCardRepository;
	private final ModelMapper modelMapper;

	public ShoppingCardManager(ShoppingCardRepository shoppingCardRepository, ModelMapper modelMapper) {
		this.shoppingCardRepository = shoppingCardRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public void createShoppingCard(CreateShoppingCardRequest shoppingCardRequest) {
		ShoppingCard shoppingCard = modelMapper.map(shoppingCardRequest, ShoppingCard.class);
		shoppingCardRepository.save(shoppingCard);

	}

	@Override
	public Optional<ShoppingCard> getAll(int id) {
		Optional<ShoppingCard> shoppingCard = Optional.ofNullable(this.shoppingCardRepository.findById(id).get());
		return shoppingCard;
	}

}
