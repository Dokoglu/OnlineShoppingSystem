package com.onlineshopping.demo.entities;

public class OrderDetails {
	
	private int orderID;
	private int productID;
	private String productName;
	private int quantity;
	private float cost;
	
	public OrderDetails(int orderID, int productID, String productName, 
			int quantity, float cost) {
		
		this.orderID = orderID;
		this.productID = productID;
		this.productName = productName;
		this.quantity = quantity;
		this.cost = cost;
	}
	public OrderDetails() {
		
	}
	
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	
	
	
	
	

}
