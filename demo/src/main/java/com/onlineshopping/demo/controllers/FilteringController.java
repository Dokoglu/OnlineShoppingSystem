package com.onlineshopping.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.demo.entities.Product;
import com.onlineshopping.demo.service.FilteringService;
import com.onlineshopping.demo.service.ProductService;

@RestController
@RequestMapping("/filtering")
public class FilteringController {


	private final FilteringService filteringService;
	

	private final ProductService productService;

	public FilteringController(FilteringService filteringService, ProductService productService) {
		this.filteringService = filteringService;
		this.productService = productService;
	}

	@GetMapping("/filteredlist")
	public List<Product> listByCategory(@RequestParam int categoryID) {
		return filteringService.listByCategory(categoryID);
	}
}
