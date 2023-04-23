package com.ems.pojo_concepts;

import java.util.List;

public class Employee {
	private String firstName;
	private String lastName;
	private String email;
	private List skills;

	public String getFirstName() {
		System.out.println("GETTER"+firstName);
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		System.out.println("SETTER"+firstName);
	}

	public String getLastName() {
		System.out.println("GETTER"+lastName);
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("SETTER"+lastName);
		this.lastName = lastName;
	}

	public String getEmail() {
		System.out.println("GETTER"+email);
		return email;
	}

	public void setEmail(String email) {
		System.out.println("SETTER"+email);
		this.email = email;
	}

	public List getskills() {
		System.out.println("GETTER"+skills);
		return skills;
	}

	public void setskills(List skills) {
		System.out.println("SETTER"+skills);
		this.skills = skills;
	}


	

}
