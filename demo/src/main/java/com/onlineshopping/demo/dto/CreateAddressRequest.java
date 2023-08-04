package com.onlineshopping.demo.dto;

public class CreateAddressRequest {

	private String name;
	private String surname;
	private String phoneNumber;
	private String header;
	private String country;
	private String city;
	private String address;

	public CreateAddressRequest(String name, String surname, String phoneNumber, String header, String country,
			String city, String address) {

		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.header = header;
		this.country = country;
		this.city = city;
		this.address = address;
	}

	public CreateAddressRequest() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
