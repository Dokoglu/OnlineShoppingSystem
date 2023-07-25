package com.onlineshopping.demo.entities;

public class Orders extends Customer{

	private int orderID;
	private String orderDate;
	private int customerID;
	
	
	
	public Orders(int id, int creditCardId, int orderID, String orderDate, int customerID) {
		super(id, creditCardId);
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.customerID = customerID;
	}


	//Getter and Setter Methods
	
	public int getOrderID() {
		return orderID;
	}



	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}



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

	
	
	
	
}
