package com.onlineshopping.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.demo.dto.CreateAddressRequest;
import com.onlineshopping.demo.entities.Address;
import com.onlineshopping.demo.service.AdressService;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AdressService adressService;
	
	@PostMapping("/add")
	void add(@RequestBody CreateAddressRequest addressRequest) {
		adressService.add(addressRequest);
	}
	void delete(int id) {
		
	}
	void update(CreateAddressRequest addressRequest, int id) {
		
	}
	List<Address> getAll(){
		return null;
	}
}
