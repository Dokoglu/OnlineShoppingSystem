package com.onlineshopping.demo.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PaymentCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int id;
	
	@NotNull
	@NotEmpty
	@Size(min= 3, max = 30)
	private int nameSurname;
	
	@NotNull
	@NotEmpty
	@Size(min= 16, max = 16)
	private int cardNumber;
	
	@NotNull
	@NotEmpty
	@Size(min= 3, max = 3)
	private int cvc;
	
	@NotNull
	@NotEmpty
	@Size(min=5, max=5, message = "**/** biçiminde yazınız")
	private int date;

	public PaymentCard(@NotNull int id, @NotNull @NotEmpty @Size(min = 3, max = 30) int nameSurname,
			@NotNull @NotEmpty @Size(min = 16, max = 16) int cardNumber,
			@NotNull @NotEmpty @Size(min = 3, max = 3) int cvc,
			@NotNull @NotEmpty @Size(min = 5, max = 5, message = "**/** biçiminde yazınız") int date) {
		
		this.id = id;
		this.nameSurname = nameSurname;
		this.cardNumber = cardNumber;
		this.cvc = cvc;
		this.date = date;
	}

	public PaymentCard() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(int nameSurname) {
		this.nameSurname = nameSurname;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCvc() {
		return cvc;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
	
	
}
