package com.onlineshopping.demo.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class ShoppingCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(insertable = false, updatable = false)
	private int customerID;

	public ShoppingCard(int id, int customerID) {

		this.id = id;
		this.customerID = customerID;
	}
	
	@OneToOne()
	@JoinColumn(name = "customerID")
	private Customer customer;
	
	@OneToMany()
	private List<Orders> orders;
	
	@OneToMany()
	private List<Product> products;

	public ShoppingCard() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	
}
