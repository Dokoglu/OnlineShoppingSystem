package com.onlineshopping.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.onlineshopping.demo.dto.CreatePaymentCardRequest;
import com.onlineshopping.demo.entities.PaymentCard;
import com.onlineshopping.demo.service.PaymentCardService;

@RestController
@RequestMapping("/paymentcard")
public class PaymentCardController {


	public PaymentCardController(PaymentCardService paymentCardService) {
		this.paymentCardService = paymentCardService;
	}

	private final PaymentCardService paymentCardService;

	@PostMapping("/addcard")
	public void add(@RequestBody CreatePaymentCardRequest paymentCardRequest) {
		paymentCardService.add(paymentCardRequest);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {

		paymentCardService.delete(id);
	}

	@PutMapping("/updatecard")
	public void update(@RequestBody CreatePaymentCardRequest paymentCardRequest, @RequestParam int id) {
		paymentCardService.update(paymentCardRequest, id);
	}

	@GetMapping("/viewcards")
	List<PaymentCard> getAll() {
		return paymentCardService.getAll();
	}
}
