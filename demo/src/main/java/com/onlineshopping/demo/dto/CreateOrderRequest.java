package com.onlineshopping.demo.dto;

public class CreateOrderRequest {

	private String orderDate;
	private int customerID; // ??
	private String productName;
	private int quantity;
	private float productPrice;
	private float cost;

	public CreateOrderRequest(String orderDate, int customerID, String productName, int quantity, float productPrice) {

		this.orderDate = orderDate;
		this.customerID = customerID;
		this.productName = productName;
		this.quantity = quantity;
		this.productPrice = productPrice;
	}

	// Getter and Setter Methods

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public float getCost() {
		return  productPrice*quantity;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
}
