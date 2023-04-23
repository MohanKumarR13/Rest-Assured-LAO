package com.lao.ems.serializeAnnotations;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
 @JsonPropertyOrder(alphabetic=true)
//@JsonPropertyOrder({"id","name","email"})
public class JsonPropertyOrderPOJO {
	 private String email;
	 private String name;
	 private int id;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JsonGetter(value="employeeId")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 


}
