package com.onlineshopping.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.demo.dto.CreateCategoryRequest;
import com.onlineshopping.demo.entities.Category;
import com.onlineshopping.demo.service.CategoryDao;

@RestController
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	private CategoryDao categoryDao;

	@PostMapping("/add")
	public void add(@RequestBody CreateCategoryRequest createCategoryRequest) {
		categoryDao.add(createCategoryRequest);

	}

	@GetMapping("/getAll")
	public List<Category> getAll() {
		return categoryDao.getAll();

	}

}
