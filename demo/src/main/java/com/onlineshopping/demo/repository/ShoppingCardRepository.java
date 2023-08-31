package com.onlineshopping.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onlineshopping.demo.entities.Product;
import com.onlineshopping.demo.entities.ShoppingCard;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Repository
public interface ShoppingCardRepository extends JpaRepository<ShoppingCard, Integer> {

	void save(int productID);
	@Query("SELECT p FROM Product p")
	void viewAllProduct(List<Product> productList);
	void save(Product product);
	void findByCustomerID(int customerID);
}
