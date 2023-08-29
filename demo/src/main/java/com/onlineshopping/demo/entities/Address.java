package com.onlineshopping.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int id;
	
	@NotNull
	@NotEmpty
	@Size(min= 3, max = 20)
	private String name;
	
	@NotNull
	@NotEmpty
	@Size(min= 3, max = 30)
	private String surname;
	
	@NotNull
	@NotEmpty
	@Size(min=10, max=10, message = "Telefon numaranızı başına 0 koymadan 10 hane şeklinde yazınız")
	private String phoneNumber;
	
	@NotNull
	@NotEmpty
	@Size(min=2, max=20)
	private String header;
	
	@NotNull
	@NotEmpty
	private String country;
	
	@NotNull
	@NotEmpty
	private String city;
	
	@NotNull
	@NotEmpty
	@Size(min=20, max=500)
	private String address;
	
	public Address(int id, String name, String surname, String phoneNumber, String header, String country, String city,
			String address) {
		
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.header = header;
		this.country = country;
		this.city = city;
		this.address = address;
	}

	public Address() {
		
	}
	@ManyToOne()
	@JoinColumn(name="customer_ID")
	private Customer customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
