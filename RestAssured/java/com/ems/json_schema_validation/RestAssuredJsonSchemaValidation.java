package com.ems.json_schema_validation;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class RestAssuredJsonSchemaValidation {
	@Test
	public void validationUsingJsonSchemaInClassPath() {
		File inputJson=new File("D:\\RestAssured LAO\\RestAssured\\src\\test\\java\\resources\\input.json");
		//File schemaJson=new File("D:\\RestAssured LAO\\RestAssured\\schema.json");
		String filePath="D:\\RestAssured LAO\\RestAssured\\schema.json";
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		  .body(inputJson)
		.when()
		.post("/employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
	}
}
