package com.authproject.app.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile
{
	private String name;
	private String email;

	//Setters and getters

//	public void setName(String name) {
//		this.name=name;
//	}
//	public String getName() {
//		return name;
//	}
//	
//	
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email=email;
//	}
//
//	@Override
//	public String toString() {
//		return "UserProfile [name=" + name + ", email=" + email + "]";
//	}
//	
//	
}