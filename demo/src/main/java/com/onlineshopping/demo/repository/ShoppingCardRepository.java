package com.onlineshopping.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onlineshopping.demo.entities.Product;
import com.onlineshopping.demo.entities.ShoppingCard;

@Repository
public interface ShoppingCardRepository extends JpaRepository<ShoppingCard, Integer> {

	void save(int productID);
	@Query("SELECT p FROM Product p") // ??? aynı anda 4 hatayı kaldırdı
	void viewAllProduct(List<Product> productList);

}
