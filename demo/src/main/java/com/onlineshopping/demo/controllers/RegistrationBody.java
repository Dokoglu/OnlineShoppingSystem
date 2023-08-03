package com.onlineshopping.demo.controllers;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class RegistrationBody {
	
	
	
	@NotNull
	@Size(min=3, max=30)
	private String name;
	
	@NotNull
	@Size(min=2, max=40)
	private String surname;
	
	@NotNull
	@NotBlank
	@Email
	private String email;
	
	@NotNull
	@NotBlank
	@Pattern(regexp = "^[a-zA-Z0-9]{6,12}$",
			 message = "Password must be of 6 to 12")
	private String password;
	
	@NotNull
	@NotEmpty
	private String type;
	
	public RegistrationBody(String name, String surname, String email, String password, String type) {
		
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.type = type;
	}

	public RegistrationBody() {


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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
