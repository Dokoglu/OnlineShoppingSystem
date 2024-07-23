package com.onlineshopping.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
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

	

}
