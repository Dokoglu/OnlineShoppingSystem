package com.onlineshopping.demo.controllers;

import java.util.List;

import com.onlineshopping.demo.exceptions.ApiRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.onlineshopping.demo.dto.CreateAddressRequest;
import com.onlineshopping.demo.entities.Address;
import com.onlineshopping.demo.service.AdressService;

@RestController
@RequestMapping("/addresses")
public class AddressController {

	private final AdressService adressService;

	public AddressController(AdressService adressService) {
		this.adressService = adressService;
	}

	@PostMapping()
	public  void add(@RequestBody CreateAddressRequest addressRequest) {
		adressService.add(addressRequest);
	}
	
	@DeleteMapping("/deleteAddress/{id}")
	public String delete(@PathVariable int id)
	{
		adressService.delete(id);
		return "ID'si"+ id+ "olan adress silindi";
	}
	
	@PutMapping("/updateAddress")
	void update(@RequestBody CreateAddressRequest addressRequest, @RequestParam int id) {
		adressService.update(addressRequest, id);
	}
	
	@GetMapping("/")
	List<Address> getAll() throws ApiRequestException {

		 throw  new ApiRequestException("It can't get all address");

	}
}
