package com.onlineshopping.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderID;
	private String orderDate;
	private int customerID;
	private String productName;
	private int quantity;
	private float cost;
	private float productPrice;

	public Orders(int orderID, String orderDate, int customerID, String productName, int quantity,
			float cost, float productPrice) {

		this.orderID = orderID;
		this.orderDate = orderDate;
		this.customerID = customerID;
		this.productName = productName;
		this.quantity = quantity;
		this.cost = cost;
		this.productPrice = productPrice;
	}
	
	@ManyToOne()
	@JoinColumn(name = "shoppingCard_ID")
	private ShoppingCard shoppingcard;

	public Orders() {
	}


	// Getter and Setter Methods

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
		return productPrice*quantity;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}


	public float getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	

}
