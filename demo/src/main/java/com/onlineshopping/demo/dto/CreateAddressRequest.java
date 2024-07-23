package com.onlineshopping.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateAddressRequest {

	private String name;
	private String surname;
	private String phoneNumber;
	private String header;
	private String country;
	private String city;
	private String address;







}
