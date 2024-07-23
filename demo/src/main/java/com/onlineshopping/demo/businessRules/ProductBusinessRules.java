package com.onlineshopping.demo.businessRules;

import com.onlineshopping.demo.exceptions.BusinessException;
import com.onlineshopping.demo.repository.ProductRepository;

public class ProductBusinessRules  extends  RuntimeException{


    private ProductRepository productRepository;

    public  void  checkIfProductExist(Integer id){

        if (productRepository.existsById(id)){

            throw  new BusinessException("Product already exists");
        }
    }
}
