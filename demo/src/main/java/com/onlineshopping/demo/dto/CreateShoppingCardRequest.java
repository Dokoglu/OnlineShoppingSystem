package com.onlineshopping.demo.dto;

public class CreateShoppingCardRequest {

	private int customerID;

	public CreateShoppingCardRequest(int customerID) {
		this.customerID = customerID;
	}

	public CreateShoppingCardRequest() {

	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

}
