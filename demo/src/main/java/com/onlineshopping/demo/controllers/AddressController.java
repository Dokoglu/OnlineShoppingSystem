package com.onlineshopping.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.demo.dto.CreateAddressRequest;
import com.onlineshopping.demo.entities.Address;
import com.onlineshopping.demo.service.AdressService;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AdressService adressService;
	
	@PostMapping("/addAddress")
	void add(@RequestBody CreateAddressRequest addressRequest) {
		adressService.add(addressRequest);
	}
	
	@DeleteMapping("/deleteAddress")
	void delete(@RequestParam int id) {
		adressService.delete(id);
	}
	
	@PutMapping("/updateAddress")
	void update(@RequestBody CreateAddressRequest addressRequest, @RequestParam int id) {
		adressService.update(addressRequest, id);
	}
	
	@GetMapping("/viewAddresses")
	List<Address> getAll(){
		return adressService.getAll();
	}
}
