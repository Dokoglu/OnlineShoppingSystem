package com.onlineshopping.demo.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreatePaymentCardRequest;
import com.onlineshopping.demo.entities.PaymentCard;
import com.onlineshopping.demo.repository.PaymentCardRepository;
@Service
public class PaymentCardManager implements PaymentCardService {

	
	private final PaymentCardRepository paymentCardRepository;
	private final ModelMapper modelMapper;
	

	public PaymentCardManager(PaymentCardRepository paymentCardRepository, ModelMapper modelMapper) {
		this.paymentCardRepository = paymentCardRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public void add(CreatePaymentCardRequest paymentCardRequest) {
		PaymentCard paymentCard = modelMapper.map(paymentCardRequest, PaymentCard.class);
		paymentCardRepository.save(paymentCard);

	}

	@Override
	public void delete(int id) {
		paymentCardRepository.deleteById(id);

	}

	@Override
	public void update(CreatePaymentCardRequest paymentCardRequest, int id) {
		PaymentCard paymentCard =  paymentCardRepository.findById(id).get();
		paymentCard=modelMapper.map(paymentCardRequest, PaymentCard.class);
		paymentCardRepository.save(paymentCard);
	}

	@Override
	public List<PaymentCard> getAll() {
		return paymentCardRepository.findAll();
	}

}
