package com.onlineshopping.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onlineshopping.demo.dto.CreateOrderRequest;
import com.onlineshopping.demo.entities.Orders;
import com.onlineshopping.demo.repository.OrderRepository;
import com.onlineshopping.demo.utilities.mappers.ModelMapperService;

@Service
public class OrdersManager implements OrderService {

	private final OrderRepository orderRepository;
	private final ModelMapperService modelMapperService;

	public OrdersManager(OrderRepository orderRepository, ModelMapperService modelMapperService) {
		this.orderRepository = orderRepository;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public void addOrder(CreateOrderRequest orderRequest) {
		Orders order = this.modelMapperService.forRequest().map(orderRequest, Orders.class);
		orderRepository.save(order);
	}

	@Override
	public List<Orders> getAllOrders() {
		return orderRepository.findAll();
	}

	@Override
	public List<Orders> getCustomerOrdersByCustomerID(int id) {
		return orderRepository.findOrdersByCustomerID(id);
	}

	@Override
	public Orders getByOrderID(int id) {
		return orderRepository.findById(id).get();
	}

	@Override
	public void cancelOrdersById(int id) {
		orderRepository.deleteById(id);

	}

}
