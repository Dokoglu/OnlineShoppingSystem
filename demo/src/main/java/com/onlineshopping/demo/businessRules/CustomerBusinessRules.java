package com.onlineshopping.demo.businessRules;

import com.onlineshopping.demo.exceptions.BusinessException;
import com.onlineshopping.demo.repository.CustomerRepository;

public class CustomerBusinessRules extends RuntimeException {

    private CustomerRepository customerRepository;

    public void  checkIfCustomerExists(String email){

        if (this.customerRepository.checkIfCustomerExist(email)){

            throw  new BusinessException("A customer with same email already exists");
        }
    }
}
