package com.onlineshopping.demo.dto;

public class CreateShoppingCardRequest {
//oluşturukmalı mı?
	private int id;
	private int productID;

	public CreateShoppingCardRequest(int id, int productID) {

		this.id = id;
		this.productID = productID;
	}

	public CreateShoppingCardRequest() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

}
