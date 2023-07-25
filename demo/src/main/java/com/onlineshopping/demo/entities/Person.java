package com.onlineshopping.demo.entities;

public class Person {

	private String name;
	private String surname;
	private String phoneNumber;
	private String eMail;
	private String adress;
	
	public Person(String name, String surname, String phoneNumber, String eMail, String adress) {
		
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
		this.adress = adress;
	}
	
	
	
	
	//Getter Setter Methods

	public Person() {
		
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

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
}
