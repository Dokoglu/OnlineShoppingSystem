package com.onlineshopping.demo.dto;

public class CreatePaymentCardRequest {

	private int id;
	private String nameSurname;
	private String cardNumber;
	private int cvc;
	private String date;

	public CreatePaymentCardRequest(int id, String nameSurname, String cardNumber, int cvc, String date) {

		this.id = id;
		this.nameSurname = nameSurname;
		this.cardNumber = cardNumber;
		this.cvc = cvc;
		this.date = date;
	}

	public CreatePaymentCardRequest() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCvc() {
		return cvc;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
