package com.onlineshopping.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreatePaymentCardRequest;
import com.onlineshopping.demo.entities.PaymentCard;
import com.onlineshopping.demo.repository.PaymentCardRepository;
@Service
public class PaymentCardManager implements PaymentCardService {

	@Autowired
	private PaymentCardRepository paymentCardRepository;

	@Override
	public void add(CreatePaymentCardRequest paymentCardRequest) {
		PaymentCard paymentCard = new PaymentCard();

		paymentCard.setCardNumber(paymentCardRequest.getCardNumber());
		paymentCard.setCvc(paymentCardRequest.getCvc());
		paymentCard.setDate(paymentCardRequest.getDate());
		paymentCard.setNameSurname(paymentCardRequest.getNameSurname());

		paymentCardRepository.save(paymentCard);

	}

	@Override
	public void delete(int id) {
		paymentCardRepository.deleteById(id);

	}

	@Override
	public void update(CreatePaymentCardRequest paymentCardRequest, int id) {
		PaymentCard paymentCard =  paymentCardRepository.findById(id).get();
		
		paymentCard.setCardNumber(paymentCardRequest.getCardNumber());
		paymentCard.setCvc(paymentCardRequest.getCvc());
		paymentCard.setDate(paymentCardRequest.getDate());
		paymentCard.setNameSurname(paymentCardRequest.getNameSurname());
		
		paymentCardRepository.save(paymentCard);
	}

	@Override
	public List<PaymentCard> getAll() {
		return paymentCardRepository.findAll();
	}

}
