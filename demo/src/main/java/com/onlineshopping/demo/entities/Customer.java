package com.onlineshopping.demo.entities;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Customer")
@Entity
@Getter
@Setter
public class Customer extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String name;
	private String surname;

	@Column(unique = true)
	private String e_mail;
	private String password;
	
	@OneToMany(mappedBy = "customer")
	private List<Address> address;
	
	@OneToMany()
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



}
