package com.onlineshopping.demo.service;

import java.util.List;

import com.onlineshopping.demo.entities.Product;

public interface SearchingService {

	List<Product> findByWord(String word);
}
