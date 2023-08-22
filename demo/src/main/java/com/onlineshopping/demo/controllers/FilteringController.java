package com.onlineshopping.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.demo.entities.Product;
import com.onlineshopping.demo.service.FilteringService;

@RestController
@RequestMapping("/Filtering")
public class FilteringController {

	@Autowired
	private FilteringService filteringService;

	@GetMapping("/filteredlist")
	public List<Product> listByCategory(@RequestParam int categoryID) {
		return filteringService.listByCategory(categoryID);
	}
}
