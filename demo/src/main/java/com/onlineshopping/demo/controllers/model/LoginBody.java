package com.onlineshopping.demo.controllers.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class LoginBody {

	@NotNull
	@NotBlank
	@Email
	private String email;
	
	@NotNull
	@NotBlank
	@Pattern(regexp = "^[a-zA-Z0-9]{6,12}$",
			 message = "Password must be of 6 to 12")
	private String password;

	public LoginBody(@NotNull @NotBlank @Email String email,
			@NotNull @NotBlank @Pattern(regexp = "^[a-zA-Z0-9]{6,12}$", message = "Password must be of 6 to 12") String password) {
		
		this.email = email;
		this.password = password;
	}

	public LoginBody() {
		
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
	
	
}
