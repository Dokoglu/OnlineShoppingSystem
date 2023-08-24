package com.onlineshopping.demo.service;

import java.util.List;
import java.util.Optional;

import com.onlineshopping.demo.entities.Product;

public interface SearchingService {

	public List<Product> findByWord(String word);
}
