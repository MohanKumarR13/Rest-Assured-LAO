package com.ems.extra_concepts;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class GetHeaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="http://localhost:3000";
		RestAssured.basePath="/employees";
		RequestSpecification requestSpecification=RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n" 
				+ "\"firstName\":\"Boomer\",\r\n" 
						+ "\"lastName\":\"Uncle\",\r\n"
						+ "\"email\":\"boomer@gmail.com\",\r\n" 
						+ "}");
		Response response=requestSpecification.request(Method.POST);
		QueryableRequestSpecification queryableRequestSpecification=SpecificationQuerier.query(requestSpecification);
		
		System.out.println(queryableRequestSpecification.getHeaders());
		System.out.println(queryableRequestSpecification.getBaseUri());
		System.out.println(queryableRequestSpecification.getBasePath());

	}

}
