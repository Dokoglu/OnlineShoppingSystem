package com.onlineshopping.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.demo.dto.CreateShoppingCardRequest;
import com.onlineshopping.demo.entities.ShoppingCard;
import com.onlineshopping.demo.service.ShoppingCardService;

@RestController
@RequestMapping("/shoppingcard")
public class ShoppingCardController {
	
	@Autowired
	private ShoppingCardService shoppingCardService;
	
	@PostMapping("/addproduct")
	void addProduct(@RequestBody CreateShoppingCardRequest shoppingCardRequest) {
		shoppingCardService.addProduct(shoppingCardRequest);
	}

	@DeleteMapping("/deleteproduct")
	void deleteProduct(@RequestParam int productID) {
		shoppingCardService.deleteProduct(productID);
	}
	
	@GetMapping("/viewshoppingcard")
	Optional<ShoppingCard> getAll(@RequestParam int id){
		return shoppingCardService.getAll(id);
	}
	
	@PutMapping("/updateShoppingCard")
	public void update(CreateShoppingCardRequest shoppingCardRequest, int customerID) {
		shoppingCardService.update(shoppingCardRequest, customerID);
	}
}
