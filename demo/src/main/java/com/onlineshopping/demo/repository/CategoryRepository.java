package com.onlineshopping.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.onlineshopping.demo.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {


    boolean existsById(int id);
}
