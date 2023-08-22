package com.onlineshopping.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.demo.dto.CreateCustomerRequest;
import com.onlineshopping.demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/addCustomer")
	public void add(@RequestBody CreateCustomerRequest createCustomerRequest) {
		customerService.add(createCustomerRequest);
	}
	
	@DeleteMapping("/deleteCustomer")
	public void delete(@RequestParam int id) {
		customerService.delete(id);
	}
	
	@GetMapping("/viewCustomers")
	public void getAll() {
		customerService.getAll();
	}
	
	@PutMapping("/update")
	public void update(@RequestBody CreateCustomerRequest createCustomerRequest, @RequestParam int id) {
		customerService.update(createCustomerRequest, id);
	}
	
/*	@GetMapping("/{name}")
	public Customer getByName(@PathVariable(value="name") String name) {
		Customer customer = new Customer();
		customer.setName(name);
		
		return customer;
	}*/
	
}
