package com.onlineshopping.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class ShoppingCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int productID;

	public ShoppingCard(int id, int productID) {

		this.id = id;
		this.productID = productID;
	}
	
	@OneToOne()
	@JoinColumn(name = "customerID")
	private Customer customer;
	
	@OneToMany()
	private List<Orders> orders;
	

	
	@ManyToMany()
	@JoinTable(
			  name = "shopping_card", 
			  joinColumns = @JoinColumn(name = "shoppingcard_id"), 
			  inverseJoinColumns = @JoinColumn(name = "product__id"))
	private List<Product> products;

	public ShoppingCard() {

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
