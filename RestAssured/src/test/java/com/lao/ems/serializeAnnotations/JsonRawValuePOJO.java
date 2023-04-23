package com.lao.ems.serializeAnnotations;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class JsonRawValuePOJO {
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
private String firstName;
private String lastName;
private String email;
@JsonRawValue
//private String skills="Java";
private String skills="{[\"java\"],[\"selenium\"]}";
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSkills() {
	return skills;
}
public void setSkills(String skills) {
	this.skills = skills;
}



}
