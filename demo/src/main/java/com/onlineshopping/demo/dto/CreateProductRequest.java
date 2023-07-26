package com.onlineshopping.demo.dto;

public class CreateProductRequest {

	private int id;
	private String name;
	private int categoryID;
	
	public CreateProductRequest(int id, String name, int categoryID) {
		
		this.id = id;
		this.name = name;
		this.categoryID = categoryID;
	}
	
	
	public CreateProductRequest() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
	
}