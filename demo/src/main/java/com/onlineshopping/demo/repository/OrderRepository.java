package com.onlineshopping.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineshopping.demo.entities.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {

	List<Orders> findOrdersByCustomerID(int id);
}
