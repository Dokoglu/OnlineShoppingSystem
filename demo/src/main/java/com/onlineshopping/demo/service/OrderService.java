package com.onlineshopping.demo.service;

import java.util.List;

import com.onlineshopping.demo.dto.CreateOrderRequest;
import com.onlineshopping.demo.entities.Orders;

public interface OrderService {

	void addOrder(CreateOrderRequest orderRequest);

	List<Orders> getAllOrders();

	List<Orders> getCustomerOrdersByCustomerID(int id);

	Orders getByOrderID(int id);

	void cancelOrdersById(int id);
}
