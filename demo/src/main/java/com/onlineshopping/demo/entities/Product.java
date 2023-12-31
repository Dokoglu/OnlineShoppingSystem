package com.onlineshopping.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name="Product")
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//outo
	@Column(name="Ürün ID")
	private int productID;
	
	@Column(name="ÜrünAdı")
	private String productName;
	
	@Column(name="ÜrünAçıklaması")
	private String description;	
	
	@Column(name="ÜrünKategorisi")
	private int categoryID;
	
	@Column(name="ÜrünFiyatı")
	private float price;

	public Product(int productID, String productName, String description, int categoryID, float price) {

		this.productID = productID;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}
	

}
