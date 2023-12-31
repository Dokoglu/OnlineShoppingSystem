package com.onlineshopping.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Entity
public class PaymentCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int id;

	@NotNull
	@NotEmpty
	@Size(min = 3, max = 30)
	private String nameSurname;

	@NotNull
	@NotEmpty
	@Size(min = 19, max = 19, message ="Her 4 hanenin arasında bir boşluk olacak şekilde yazınız.")
	private String cardNumber;

	@NotNull
	@Max(value = 999)
	private int cvc;

	@NotNull
	@NotEmpty
	@Size(min = 5, max = 5, message = "**/** biçiminde yazınız")
	private String date;

	public PaymentCard(@NotNull int id, @NotNull @NotEmpty @Size(min = 3, max = 30) String nameSurname,
			@NotNull @NotEmpty @Size(min = 16, max = 16) String cardNumber,
			@NotNull @NotEmpty @Size(min = 3, max = 3) int cvc,
			@NotNull @NotEmpty @Size(min = 5, max = 5, message = "**/** biçiminde yazınız") String date) {

		this.id = id;
		this.nameSurname = nameSurname;
		this.cardNumber = cardNumber;
		this.cvc = cvc;
		this.date = date;
	}
	
	@ManyToOne()
	@JoinColumn(name= "customerId")
	private Customer customer;

	public PaymentCard() {

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
