package com.onlineshopping.demo.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ShoppingCardNotFound  extends  RuntimeException{

    public  ShoppingCardNotFound (String message){

        super(message);
    }
}
