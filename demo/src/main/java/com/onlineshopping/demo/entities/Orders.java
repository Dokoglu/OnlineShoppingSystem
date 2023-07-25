package com.onlineshopping.demo.entities;

public class Orders {

	private int orderID;
	private String orderDate;
	private int customerID;
	
	
	
	public Orders(int orderID, String orderDate, int customerID) {

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
