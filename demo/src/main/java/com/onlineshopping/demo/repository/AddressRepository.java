package com.onlineshopping.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineshopping.demo.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer>{

}
