package com.onlineshopping.demo.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreateAddressRequest;
import com.onlineshopping.demo.entities.Address;
import com.onlineshopping.demo.repository.AddressRepository;

@Service
public class AddressManager implements AdressService {

	
	private final AddressRepository addressRepository;
	private final ModelMapper modelMapper;
	

	public AddressManager(AddressRepository addressRepository, ModelMapper modelMapper) {
		this.addressRepository = addressRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public void add(CreateAddressRequest addressRequest) {

		Address address =modelMapper.map(addressRequest, Address.class);
		addressRepository.save(address);
	}

	@Override
	public void delete(int id) {
		addressRepository.deleteById(id);
	}

	@Override
	public void update(CreateAddressRequest addressRequest, int id) {
		
		Address address = addressRepository.findById(id).get();
		address=modelMapper.map(addressRequest, Address.class);
		addressRepository.save(address);

	}

	@Override
	public List<Address> getAll() {
		
		return addressRepository.findAll();
		
	}

}
