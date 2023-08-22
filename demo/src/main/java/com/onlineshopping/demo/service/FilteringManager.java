package com.onlineshopping.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.demo.entities.Product;
import com.onlineshopping.demo.repository.ProductRepository;

@Service
public class FilteringManager implements FilteringService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> listByCategory(int categoryID) {
		List<Product> filteredList = new ArrayList<Product>();
		
		for(Product p: productRepository.findAll()) {
			if(p.getCategoryID() == categoryID)
				filteredList.add(p);
		}
		return filteredList;
	}

}
