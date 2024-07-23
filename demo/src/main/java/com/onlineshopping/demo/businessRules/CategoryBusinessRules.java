package com.onlineshopping.demo.businessRules;

import com.onlineshopping.demo.exceptions.BusinessException;
import com.onlineshopping.demo.repository.CategoryRepository;

public class CategoryBusinessRules {

    private CategoryRepository categoryRepository;

    public void checkIfCategoryExists(int id){

        if(!this.categoryRepository.existsById(id)){

            throw  new BusinessException("Category already exists so can't be added");
        }
    }
}
