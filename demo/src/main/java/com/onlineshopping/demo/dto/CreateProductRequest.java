package com.onlineshopping.demo.dto;

public class CreateProductRequest {

	private int id;
	private String name;
	private String description;
	private int categoryID;
	private float price;
	
	public CreateProductRequest(int id, String name,String description ,int categoryID, float price) {
		this.id=id;
		this.name = name;
		this.description = description;
		this.categoryID = categoryID;
		this.price = price;
		
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public CreateProductRequest() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
