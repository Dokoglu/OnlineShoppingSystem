package com.onlineshopping.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.demo.entities.Product;
import com.onlineshopping.demo.service.SearchingService;

@RestController
@RequestMapping("/search")
public class SearchingController {

	@Autowired
	private SearchingService searchingService;

	@GetMapping("/{word}")
	public List<Product> findByWord(@PathVariable(value = "word") String word) {
		return searchingService.findByWord(word);
	}

}
