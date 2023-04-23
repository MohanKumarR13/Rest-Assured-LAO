package com.ems.extra_concepts;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationExample {
	RequestSpecification requestSpecifications;

	@BeforeSuite
	public void setRequestSpecification() {
		requestSpecifications = given().baseUri("http://localhost:3000").basePath("/employees");
		RestAssured.requestSpecification=requestSpecifications;
	}

	@Test(enabled = true)
	public void getAllEmployeesBDD() {
		given().when().get().prettyPrint();

	}

	@Test(enabled = true)
	public void getAnEmployeeBDD() {

		given().when().get("/22").prettyPrint();

	}
	
	@Test(enabled = true)
	public void createAnEmployeeBDD() {
		RequestSpecification specification=given().contentType(ContentType.JSON);
		HashMap<String, String> jsonObject = new HashMap<String, String>();
		jsonObject.put("first_name", "Nick");
		jsonObject.put("last_name", "Fury");
		jsonObject.put("email", "sheild@gmail.com");
		given()
		.spec(specification)
		.baseUri("http://localhost:3000")
		//.header("Content-Type", "application/json")
		.body(jsonObject).when()
				.post().prettyPrint();

	}
}
