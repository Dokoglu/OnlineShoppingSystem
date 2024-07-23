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
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int id;
	

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
	
	public Address(int id,  String header, String country, String city,
			String address) {
		
		this.id = id;
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



}
