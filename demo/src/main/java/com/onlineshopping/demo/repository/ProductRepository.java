package com.onlineshopping.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.onlineshopping.demo.entities.Product;

@EnableJpaRepositories
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findProductByCategoryID(int id);

	List<Product> findByProductNameContainingIgnoreCase(String word);

	@Override
	boolean existsById(Integer id);
}
