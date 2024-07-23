package com.onlineshopping.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name="Product")
@Entity
@Getter
@Setter
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//outo
	@Column(name="Ürün ID")
	private int id;
	
	@Column(name="ÜrünAdı")
	private String productName;
	
	@Column(name="ÜrünAçıklaması")
	private String description;	
	
	@Column(name="ÜrünKategorisi")
	private int categoryID;
	
	@Column(name="ÜrünFiyatı")
	private float price;

	public Product(int id, String productName, String description, int categoryID, float price) {

		this.id= id;
		this.productName = productName;
		this.description = description;
		this.categoryID = categoryID;
		this.price = price;
		}
	
	public Product() {
		
	}
	
	@ManyToOne()
	@JoinColumn(name="shoppingCard_id")
	private ShoppingCard shoppingCard;
	
	
//	@ManyToOne
//	@JoinColumn(name="categoryID")
//	private List<Category> categories;
	


	// Getter and Setter Methods



}
