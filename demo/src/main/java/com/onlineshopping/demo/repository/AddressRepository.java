package com.onlineshopping.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineshopping.demo.entities.Address;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer>{

}
