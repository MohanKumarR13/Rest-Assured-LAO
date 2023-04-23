package com.lao.deserializeAnnotations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonCreatorPOJO {
	private int id;
	private String name;
	private String email;
	@JsonCreator
	public JsonCreatorPOJO(
			@JsonProperty("employeeId")
			int id,
			@JsonProperty("name")
			String name,
			@JsonProperty("email")
			String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}
	
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	
}
