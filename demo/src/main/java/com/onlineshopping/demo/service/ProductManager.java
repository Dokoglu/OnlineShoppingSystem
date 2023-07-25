package com.onlineshopping.demo.service;

import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreateProductRequest;
import com.onlineshopping.demo.entities.Product;
import com.onlineshopping.demo.repository.ProductRepository;

@Service
public class ProductManager implements ProductService {

	private ProductRepository productRepository;

	public void add(CreateProductRequest createProductRequest) {
		CreateProductRequest productRequest = new CreateProductRequest();
		Product product = new Product();
		product.setProductID(productRequest.getId());
		product.setCategooryID(productRequest.getCategoryID());
		product.setProductName(productRequest.getName());

		this.productRepository.save(product);
	}

	public void delete(int id) {
		this.productRepository.deleteById(id);
	}

	public void update(CreateProductRequest createProductRequest, int id) {
		for (Product p : productList) {
			if (p.getProductID() == product.getProductID())
				p = product;
		}
	}

}
