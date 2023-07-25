package com.onlineshopping.demo.entities;

public class Customer extends Person{
	
// TODO Auto-generated constructor stub
	
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
