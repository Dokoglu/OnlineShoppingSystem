package com.onlineshopping.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.entities.Product;

@Service
public class SearchingManager implements SearchingService {

	@Autowired
	private ProductService productService;

	@Override
	public List<Product> findByWord(String word) {

		return productService.findNameContainingIgnoreCase(word);
	}
}