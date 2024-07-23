package com.onlineshopping.demo.exceptions;

public class PaymentCardNotFoundException  extends RuntimeException{

        public PaymentCardNotFoundException (String message){

            super(message);
        }

}
