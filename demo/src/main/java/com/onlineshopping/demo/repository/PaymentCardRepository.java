package com.onlineshopping.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineshopping.demo.entities.PaymentCard;

@Repository
public interface PaymentCardRepository extends JpaRepository<PaymentCard,Integer>{
	
}

