package com.ems.non_bdd;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Employees_NON_BDD {
	@Test(enabled = false)
	public void getAllEmployees() {
		RestAssured.baseURI = "http://localhost:3000/";

		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.request(Method.GET, "employees");

		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());

	}

	@Test(enabled = false)
	public void createAnEmployee() {
		RestAssured.baseURI = "http://localhost:3000/";
		HashMap<String, String> jsonObject = new HashMap<String, String>();
		jsonObject.put("first_name", "red");
		jsonObject.put("last_name", "hulk");
		jsonObject.put("email", "thunderboldross@gmail.com");
		RequestSpecification requestSpecification = RestAssured.given()

				/*
				 * .header("Content-Type","application/json")
				 */ .contentType("application/json")
				/*
				 * .body("{\r\n" +" \"first_name\": \"nicks\",\r\n"
				 * +" \"last_name\": \"odins\",\r\n" +" \"email\": \"odins@gmail.com\",\r\n"
				 * +"\r\n" +"}");
				 */
				.body(jsonObject);

		Response response = requestSpecification.request(Method.POST, "employees");

		System.out.println(response.getStatusLine());
		System.out.println(response.asPrettyString());

	}

	@Test(enabled = true)
	public void updateAnEmployee() {
		RestAssured.baseURI = "http://localhost:3000/";
		RestAssured.basePath = "employees/5";
		HashMap<String, String> jsonObject = new HashMap<String, String>();
		jsonObject.put("first_name", "incredibleHulk");
		jsonObject.put("last_name", "incredibleHulk");
		jsonObject.put("email", "rossredhulk@gmail.com");
		RestAssured.given().contentType("application/json").body(jsonObject).when().put();
//		  .body("{\r\n" +" \"first_name\": \"redHulk\",\r\n"
//		  +" \"last_name\": \"hulkred\",\r\n" +" \"email\": \"thunderboldrossredhulk@gmail.com\",\r\n"
//		  +"\r\n" +"}");
//	Response response=	 requestSpecification.request(Method.PUT,"employees/15");
		System.out.println(jsonObject);
	}

//	
	@Test(enabled = false)
	public void deleteEmployee() {
		RestAssured.baseURI = "http://localhost:3000/";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.request(Method.DELETE, "employees/15");
		System.out.println(response.asPrettyString());

	}

	@Test(enabled = true)
	public void getEmployee() {
		RestAssured.baseURI = "http://localhost:3000/";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.request(Method.GET, "employees/1");
		System.out.println(response.asPrettyString());

	}

}
