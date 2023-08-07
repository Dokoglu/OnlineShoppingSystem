package com.onlineshopping.demo.service;

import java.util.List;

import com.onlineshopping.demo.dto.CreatePaymentCardRequest;
import com.onlineshopping.demo.entities.PaymentCard;

public interface PaymentCardService {

	void add(CreatePaymentCardRequest paymentCardRequest);
	void delete(int id);
	void update(CreatePaymentCardRequest paymentCardRequest, int id);
	List<PaymentCard> getAll();
}
