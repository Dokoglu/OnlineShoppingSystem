package com.onlineshopping.demo.dto;

public class CreateCustomerRequest {
	
	private String name;
	private String surname;
	private String eMail;
	private String password;
	
	public CreateCustomerRequest( String name, String surname, String eMail, String passwoord) {
		this.name = name;
		this.surname=surname;
		this.eMail = eMail;
		this.password = password;
	}

	public CreateCustomerRequest() {
		
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
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
