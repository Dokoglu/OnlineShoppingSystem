package com.onlineshopping.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Customer")
@Entity
public class Customer extends User{
	
// TODO Auto-generated constructor stub
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int creditCardId;
	
	public Customer(String name, String surname, String phoneNumber, String eMail,
			String adress, int id, int creditCardId) {
		super(name, surname, phoneNumber, eMail, adress);
		this.id=id;
		this.creditCardId=creditCardId;
	}
	
	public Customer() {
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCreditCardId() {
		return creditCardId;
	}
	public void setCreditCardId(int creditCardId) {
		this.creditCardId = creditCardId;
	}
	
	
	
	
	
	

}
