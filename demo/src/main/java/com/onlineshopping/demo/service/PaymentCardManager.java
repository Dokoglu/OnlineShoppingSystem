package com.onlineshopping.demo.service;

import java.util.List;

import com.onlineshopping.demo.exceptions.PaymentCardNotFoundException;
import com.onlineshopping.demo.utilities.mappers.ModelMapperManager;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreatePaymentCardRequest;
import com.onlineshopping.demo.entities.PaymentCard;
import com.onlineshopping.demo.repository.PaymentCardRepository;
@Service
public class PaymentCardManager implements PaymentCardService {

	
	private final PaymentCardRepository paymentCardRepository;
	private final ModelMapperManager modelMapperManager;

	private PaymentCardNotFoundException paymentCardNotFoundException;
	

	public PaymentCardManager(PaymentCardRepository paymentCardRepository, ModelMapperManager modelMapperManager) {
		this.paymentCardRepository = paymentCardRepository;
		this.modelMapperManager = modelMapperManager;
	}

	@Override
	public void add(CreatePaymentCardRequest paymentCardRequest) {
		PaymentCard paymentCard = modelMapperManager.forRequest().map(paymentCardRequest, PaymentCard.class);
		paymentCardRepository.save(paymentCard);

	}

	@Override
	public void delete(int id) {
		paymentCardRepository.deleteById(id);

	}

	@Override
	public void update(CreatePaymentCardRequest paymentCardRequest, int id) {
		PaymentCard paymentCard =  paymentCardRepository.findById(id).orElseThrow(() -> new PaymentCardNotFoundException("Payment card not found "+ id));
		modelMapperManager.forRequest().map(paymentCardRequest, paymentCard);
		paymentCardRepository.save(paymentCard);
	}

	@Override
	public List<PaymentCard> getAll() {


		return paymentCardRepository.findAll();
	}

}
