package com.onlineshopping.demo.service;

import java.util.ArrayList;
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
		List<Product> listedByWord = new ArrayList<>();
		
		for (Product  p: productService.findAll()) { //sorun burada
			if(p.getProductName().contains(word))
				listedByWord.add(p);
		}
		return listedByWord;
	}

}
 /*for (Product  p: productService.findAll()) {
			for (int i = 0; i <= p.getProductName().length(); i++) {
				int j;
				for (j = 0; j < word.length(); j++) {
					if (p.getProductName().charAt(i + j) != word.charAt(j)) {
						break;
					}
				}
				if (j == word.length()) {
					listedByWord.add(p);
				}
			}
		}*/
