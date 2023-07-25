package com.onlineshopping.demo.entities;

public class Product {

//	@Id
	private int productID;
	private String productName;
	private String description;
	private int categooryID;

	public Product(int productID, String productName, String description, int categooryID) {

		this.productID = productID;
		this.productName = productName;
		this.description = description;
		this.categooryID = categooryID;
	}
	

	public Product() {
		super();
	}


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

	public int getCategooryID() {
		return categooryID;
	}

	public void setCategooryID(int categooryID) {
		this.categooryID = categooryID;
	}

}
