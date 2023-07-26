package com.onlineshopping.demo.dto;

public class GetByIdProductResponse {

	private String productName;
	private float productPrice;
	
	public GetByIdProductResponse(String productName, float productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public GetByIdProductResponse() {
		super();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//Getter Setter Methods
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
	
	
}
