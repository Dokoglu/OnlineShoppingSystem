package com.onlineshopping.demo.entities;

public class Product {

	private int productID;
	private String productName;
	private String description;
	private String productType;
	public Product(int productID, String productName, String description, String productType) {
		
		this.productID = productID;
		this.productName = productName;
		this.description = description;
		this.productType = productType;
	}
	
	
	//Getter and Setter Methods
	
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
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	
}
