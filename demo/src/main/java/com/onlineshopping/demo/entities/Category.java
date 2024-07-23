package com.onlineshopping.demo.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name="Category")


@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="KategoriID")
	private int id;
	
	@Column(name="KategoriAdı")
	private String name;
	
	public Category(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public Category() {
		
	}
//	@OneToMany(mappedBy="category")
	//List<Product> products;
	
	

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
	
	
	
	

}
