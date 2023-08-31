package com.onlineshopping.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreateProductRequest;
import com.onlineshopping.demo.dto.GetAllProductResponse;
import com.onlineshopping.demo.dto.GetByIdProductResponse;
import com.onlineshopping.demo.entities.Product;
import com.onlineshopping.demo.repository.ProductRepository;

@Service
public class ProductManager implements ProductService {

	
	private final  ProductRepository productRepository;
	private final ModelMapper modelMapper;
	
	

	public ProductManager(ProductRepository productRepository, ModelMapper modelMapper) {
		this.productRepository = productRepository;
		this.modelMapper = modelMapper;
	}

	public void add(CreateProductRequest createProductRequest) {
		Product product = modelMapper.map(createProductRequest, Product.class);
		this.productRepository.save(product);
	}

	public void delete(int id) {
		this.productRepository.deleteById(id);
	}

	public void update(CreateProductRequest createProductRequest, int id) {
		Product product = productRepository.findById(id).orElseThrow();
		product.setCategoryID(createProductRequest.getCategoryID());
		product.setPrice(createProductRequest.getPrice());
		product.setProductName(createProductRequest.getName());
		product.setDescription(createProductRequest.getDescription());

		this.productRepository.save(product);
	}

	@Override
	public GetByIdProductResponse getById(int id) {
		Product product = productRepository.findById(id).orElseThrow();
		GetByIdProductResponse productResponse = new GetByIdProductResponse();
		productResponse.setProductName(product.getProductName());
		productResponse.setProductPrice(product.getPrice());

		return productResponse;
	}

	@Override
	public List<GetAllProductResponse> getAll() {
		List<Product> products = productRepository.findAll();
		List<GetAllProductResponse> productResponse = new ArrayList<GetAllProductResponse>();
		for (Product p : products) {
			GetAllProductResponse responseItem = new GetAllProductResponse();
			responseItem.setName(p.getProductName());
			responseItem.setPrice(p.getPrice());
			productResponse.add(responseItem);
		}

		return productResponse;
	}

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public List<Product> getByCategoryID(int id) {

		return productRepository.findProductByCategoryID(id);
	}

	@Override
	public List<Product> findNameContainingIgnoreCase(String word) {
		return productRepository.findByProductNameContainingIgnoreCase(word);
	}

}
