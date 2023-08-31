package com.onlineshopping.demo.dto;

public class CreateShoppingCardRequest {

	private int productID;
	private int customerID;

	public CreateShoppingCardRequest(int productID, int customerID) {
		this.productID = productID;
		this.customerID = customerID;
	}

	public CreateShoppingCardRequest() {

	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

}
