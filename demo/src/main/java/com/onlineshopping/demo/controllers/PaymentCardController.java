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

import com.onlineshopping.demo.dto.CreatePaymentCardRequest;
import com.onlineshopping.demo.entities.PaymentCard;
import com.onlineshopping.demo.service.PaymentCardService;

@RestController
@RequestMapping("/paymentcard")
public class PaymentCardController {

	@Autowired
	private PaymentCardService paymentCardService;

	@PostMapping("/addcard")
	public void add(@RequestBody CreatePaymentCardRequest paymentCardRequest) {
		paymentCardService.add(paymentCardRequest);
	}

	@DeleteMapping("/deletecard")
	void delete(@RequestParam int id) {
		paymentCardService.delete(id);
	}

	@PutMapping("/updatecard")
	void update(@RequestBody CreatePaymentCardRequest paymentCardRequest, @RequestParam int id) {
		paymentCardService.update(paymentCardRequest, id);
	}

	@GetMapping("/viewcards")
	List<PaymentCard> getAll() {
		return paymentCardService.getAll();
	}
}
