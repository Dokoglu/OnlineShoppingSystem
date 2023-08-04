package com.onlineshopping.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreateAddressRequest;
import com.onlineshopping.demo.entities.Address;
import com.onlineshopping.demo.repository.AddressRepository;

@Service
public class AddressManager implements AdressService {

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public void add(CreateAddressRequest addressRequest) {

		Address address = new Address();

		address.setName(addressRequest.getName());
		address.setAddress(addressRequest.getAddress());
		address.setCity(addressRequest.getCity());
		address.setCountry(addressRequest.getCountry());
		address.setHeader(addressRequest.getHeader());
		address.setId(addressRequest.getId());
		address.setPhoneNumber(addressRequest.getPhoneNumber());
		address.setSurname(addressRequest.getSurname());

		addressRepository.save(address);
	}

	@Override
	public void delete(int id) {
		addressRepository.deleteById(id);
	}

	@Override
	public void update(CreateAddressRequest addressRequest, int id) {
		
		Address address = addressRepository.findById(id).get();
		address.setName(addressRequest.getName());
		address.setAddress(addressRequest.getAddress());
		address.setCity(addressRequest.getCity());
		address.setCountry(addressRequest.getCountry());
		address.setHeader(addressRequest.getHeader());
		address.setId(addressRequest.getId());
		address.setPhoneNumber(addressRequest.getPhoneNumber());
		address.setSurname(addressRequest.getSurname());

		addressRepository.save(address);

	}

	@Override
	public List<Address> getAll() {
		
		return addressRepository.findAll();
		
	}

}
