package com.onlineshopping.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.demo.dto.CreateProductRequest;
import com.onlineshopping.demo.dto.GetAllProductResponse;
import com.onlineshopping.demo.dto.GetByIdProductResponse;
import com.onlineshopping.demo.entities.Product;
import com.onlineshopping.demo.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	private final ProductService productService;

	public ProductController(ProductService productService) {

		this.productService = productService;
	}

	@PostMapping("/add")
	public void add(@RequestBody CreateProductRequest productRequest) {

		productService.add(productRequest);
	}

	@DeleteMapping("/deleteProduct")
	public void delete(@RequestParam int id) {
		productService.delete(id);
	}

	@PutMapping("/update")
	public void update(@RequestBody CreateProductRequest createProductRequest, @RequestParam int id) {
		productService.update(createProductRequest, id);
	}

	@GetMapping("/findProduct")
	public GetByIdProductResponse getById(@RequestParam int id) {
		return productService.getById(id);
	}

	@GetMapping("/viewProducts")
	public List<GetAllProductResponse> getAll() {
		return productService.getAll();
	}

}
