package com.onlineshopping.demo.businessRules;

import com.onlineshopping.demo.exceptions.BusinessException;
import com.onlineshopping.demo.exceptions.ShoppingCardNotFound;
import com.onlineshopping.demo.repository.ShoppingCardRepository;

public class ShoppingCardBusinessRules {

    private ShoppingCardRepository shoppingCardRepository;
    public void checkIfShoppingCardIdExists(int id){

        if(!shoppingCardRepository.existsById(id)) {

            throw  new ShoppingCardNotFound("Id doesn't exist");

        }
    }



}
