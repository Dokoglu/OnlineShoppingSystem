package com.onlineshopping.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "Customer")
@Entity
public class Customer extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String name;
	private String surname;
	private String e_mail;
	private String password;
	
	@OneToMany(mappedBy = "customer")
	private List<Address> address;
	
	@OneToMany(mappedBy = "customer")
	private List<PaymentCard> paymentCards;
	
	@OneToOne()
	@JoinColumn(name = "shoppingCardID")
	private ShoppingCard shoppingCard;	

	public Customer(int id, String name, String surname, String e_mail, String password, String type) {
		super(type);

		this.id = id;
		this.password = password;

	}

	public Customer() {

	}

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

	public String geteMail() {
		return e_mail;
	}

	public void seteMail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
