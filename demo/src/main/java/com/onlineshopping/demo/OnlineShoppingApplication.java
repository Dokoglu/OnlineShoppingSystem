package com.onlineshopping.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.onlineshopping.demo.entities.Category;
import com.onlineshopping.demo.service.CategoryDao;
import com.onlineshopping.demo.service.CategoryManager;

@SpringBootApplication
public class OnlineShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShoppingApplication.class, args);
		
		Category category1=new Category(1,"Bilgisyar");
		
		CategoryDao categoryDao=new CategoryManager();
		categoryDao.add(category1);
	}

}
