package com.onlineshopping.demo.dto;

public class GetAllProductResponse {

	private String name;
	private float price;
	
	public GetAllProductResponse(String name, float price) {
		this.name = name;
		this.price = price;
	}
	public GetAllProductResponse() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
