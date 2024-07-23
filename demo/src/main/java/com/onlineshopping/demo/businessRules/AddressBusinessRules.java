package com.onlineshopping.demo.businessRules;

import com.onlineshopping.demo.exceptions.AddressNotFoundException;
import com.onlineshopping.demo.exceptions.BusinessException;
import com.onlineshopping.demo.repository.AddressRepository;

public class AddressBusinessRules  extends RuntimeException{

    private AddressRepository addressRepository;
    private AddressNotFoundException addressNotFoundException;

    public  void  checkIfAddressIdExistsToUpdate(int id){

        addressRepository.findById(id).orElseThrow(() ->
                new AddressNotFoundException("Güncellenmesi istenen adrese ait id"+ id + "bulunamadı"));
    }
}
