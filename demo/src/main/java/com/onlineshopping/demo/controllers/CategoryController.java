package com.onlineshopping.demo.controllers;

import java.util.List;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.demo.dto.CreateCategoryRequest;
import com.onlineshopping.demo.dto.GetAllCategoryResponse;
import com.onlineshopping.demo.service.CategoryDao;

@RestController
@RequestMapping("/categories")
public class CategoryController {

	private final CategoryDao categoryDao;

	public CategoryController(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	@PostMapping("/add")
	public void add(@Valid @RequestBody CreateCategoryRequest createCategoryRequest) {

		 categoryDao.add(createCategoryRequest);

	}

	@GetMapping("/getAll")
	public ResponseEntity<List<GetAllCategoryResponse>> getAllResponse()
	{
		return ResponseEntity.ok( categoryDao.getAllResponse());
	}

}
