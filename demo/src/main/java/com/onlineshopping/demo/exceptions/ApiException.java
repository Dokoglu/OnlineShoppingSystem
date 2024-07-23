package com.onlineshopping.demo.exceptions;

import org.springframework.http.HttpStatus;

import java.util.HashMap;

public class ApiException {

    private final  String message;
    private  final Throwable throwable;
    private  final HttpStatus httpStatus;

    public ApiException(String message, Throwable throwable, HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }
}
