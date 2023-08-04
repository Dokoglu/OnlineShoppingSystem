package com.onlineshopping.demo.service;

import java.util.List;

import com.onlineshopping.demo.dto.CreateAddressRequest;
import com.onlineshopping.demo.entities.Address;

public interface AdressService {
	
	void add(CreateAddressRequest addressRequest);
	void delete(int id);
	void update(CreateAddressRequest addressRequest, int id);
	List<Address> getAll();

}
