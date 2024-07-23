package com.onlineshopping.demo.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {



    @ExceptionHandler(ApiRequestException.class)
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException exception){
        HttpStatus badRequest=HttpStatus.BAD_REQUEST;

        ApiException apiException= new ApiException(

                exception.getMessage(),
                exception,
                HttpStatus.BAD_REQUEST
        );

        return  new ResponseEntity<>(apiException, badRequest);


    }

    @ExceptionHandler(ShoppingCardNotFound.class)
    public ResponseEntity<Object>
    handleShoppingCardNotFoundException(ShoppingCardNotFound shoppingCardNotFound){

        HttpStatus notFoundRequest=HttpStatus.NOT_FOUND;

        ApiException shoppingCardException = new ApiException(

                shoppingCardNotFound.getMessage(),
                shoppingCardNotFound,
                HttpStatus.NOT_FOUND
                );
       return new  ResponseEntity<>(shoppingCardException, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(CategoryNotFound.class)

    public  ResponseEntity<Object> handleCategoryNotFoundException(CategoryNotFound categoryNotFound) {

        HttpStatus notFoundCategoryRequest = HttpStatus.NOT_FOUND;

        ApiException categoryException = new ApiException(
                categoryNotFound.getMessage(),
                categoryNotFound,
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(categoryException, HttpStatus.NOT_FOUND);
    }
    }




