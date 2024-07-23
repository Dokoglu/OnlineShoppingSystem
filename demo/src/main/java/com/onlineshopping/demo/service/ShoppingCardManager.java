package com.onlineshopping.demo.service;

import java.util.List;
import java.util.Optional;

import com.onlineshopping.demo.businessRules.ShoppingCardBusinessRules;
import com.onlineshopping.demo.utilities.mappers.ModelMapperManager;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreateShoppingCardRequest;
import com.onlineshopping.demo.entities.Customer;
import com.onlineshopping.demo.entities.Product;
import com.onlineshopping.demo.entities.ShoppingCard;
import com.onlineshopping.demo.repository.ShoppingCardRepository;
@Service
public class ShoppingCardManager implements ShoppingCardService {

	private final ShoppingCardRepository shoppingCardRepository;
	private final ModelMapperManager modelMapperManager;

	private ShoppingCardBusinessRules shoppingCardBusinessRules;

	public ShoppingCardManager(ShoppingCardRepository shoppingCardRepository, ModelMapperManager modelMapperManager) {
		this.shoppingCardRepository = shoppingCardRepository;
		this.modelMapperManager = modelMapperManager;
	}

	@Override
	public void createShoppingCard(CreateShoppingCardRequest shoppingCardRequest) {
		ShoppingCard shoppingCard = modelMapperManager.forRequest().map(shoppingCardRequest, ShoppingCard.class);
		shoppingCardRepository.save(shoppingCard);

	}

	@Override
	public List<ShoppingCard> getAll(int id) {

		this.shoppingCardBusinessRules.checkIfShoppingCardIdExists(id);

		List<ShoppingCard> shoppingCards=shoppingCardRepository.findAll();

		return shoppingCards;
	}

}
