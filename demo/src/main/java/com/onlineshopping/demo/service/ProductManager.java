package com.onlineshopping.demo.service;

import java.util.ArrayList;

import com.onlineshopping.demo.entities.Product;

public class ProductManager implements ProductService{
	
	ArrayList<Product> productList = new ArrayList<>();
	
	public void add(Product product) {		
		productList.add(product);
	}
	
	public void delete(Product product) { //Direkt olarak id almamalı produnc.getID yapmalıyız
		productList.remove(product);
	}
	
	public void update(Product product) {
		for(Product p: productList) {
			if(p.getProductID() == product.getProductID())
				p = product;
		}
	}
	
}
