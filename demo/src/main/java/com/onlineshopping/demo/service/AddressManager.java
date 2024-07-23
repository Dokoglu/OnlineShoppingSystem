package com.onlineshopping.demo.service;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.onlineshopping.demo.businessRules.AddressBusinessRules;
import com.onlineshopping.demo.exceptions.BusinessException;
import com.onlineshopping.demo.utilities.mappers.ModelMapperManager;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreateAddressRequest;
import com.onlineshopping.demo.entities.Address;
import com.onlineshopping.demo.repository.AddressRepository;

@Service
public class AddressManager implements AdressService {

	
	private final AddressRepository addressRepository;
	private final ModelMapperManager modelMapperManager;
	private final ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());
	private  AddressBusinessRules addressBusinessRules;

	public AddressManager(AddressRepository addressRepository, ModelMapperManager modelMapperManager) {
		this.addressRepository = addressRepository;
		this.modelMapperManager = modelMapperManager;
	}

	@Override
	public void add(CreateAddressRequest addressRequest) {

		Address address =modelMapperManager.forRequest().map(addressRequest, Address.class);
		addressRepository.save(address);
	}

	@Override
	public void delete(int id) {
		addressRepository.deleteById(id);
	}

	@Override
	public void update(CreateAddressRequest addressRequest, int id) {
		 this.addressBusinessRules.checkIfAddressIdExistsToUpdate(id);
		 Address address=new Address() ;
		 modelMapperManager.forRequest().map(addressRequest, address);
		 addressRepository.save(address);

	}

	@Override
	public List<Address> getAll() {
		
		return addressRepository.findAll();
		
	}

}
