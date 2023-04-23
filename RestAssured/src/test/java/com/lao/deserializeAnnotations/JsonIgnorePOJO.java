package com.lao.deserializeAnnotations;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonIgnoreProperties({"age","email"})
@JsonInclude(Include.NON_NULL)

public class JsonIgnorePOJO {
private int id;
private String name;
private String email;
private Date DateOfBirth;

private int age;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Date getDateOfBirth() {
	return DateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	DateOfBirth = dateOfBirth;
}
public int getAge() {
	return age;
}


}
