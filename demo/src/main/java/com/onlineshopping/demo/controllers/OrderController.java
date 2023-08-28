package com.onlineshopping.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.demo.dto.CreateOrderRequest;
import com.onlineshopping.demo.entities.Orders;
import com.onlineshopping.demo.service.OrderService;

@RestController
@RequestMapping("/Orders")
public class OrderController {

	private final OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@PostMapping("/createOrder")
	public void addOrder(@RequestBody CreateOrderRequest orderRequest) {
		orderService.addOrder(orderRequest);
	}

	@GetMapping("/getAllOrders")
	public List<Orders> getAllOrders() {
		return orderService.getAllOrders();
	}

	@GetMapping("/getCustomerOrdersByCustomerId")
	public List<Orders> getCustomerOrdersByCustomerID(@RequestParam int id) {
		return orderService.getCustomerOrdersByCustomerID(id);
	}

	@GetMapping("/getOrderById")
	public Orders getByOrderID(@RequestParam int id) {
		return orderService.getByOrderID(id);
	}

	@GetMapping("/cancelOrders")
	public void cancelOrdersById(@RequestParam int id) {
		orderService.cancelOrdersById(id);
	}

}
