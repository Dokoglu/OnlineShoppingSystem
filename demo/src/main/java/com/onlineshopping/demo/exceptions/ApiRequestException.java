package com.onlineshopping.demo.exceptions;

import org.apache.logging.log4j.message.Message;

public class ApiRequestException extends  RuntimeException {

    public  ApiRequestException (String message){

        super(message);
    }

    public  ApiRequestException (String message, Throwable cause){

        super(message, cause);
    }


}
