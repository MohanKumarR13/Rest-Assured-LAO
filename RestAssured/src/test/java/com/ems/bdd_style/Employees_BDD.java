package com.ems.bdd_style;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.HashMap;

import org.testng.annotations.Test;

public class Employees_BDD {
	@Test(enabled = false)
	public void getAllEmployeesBDD() {

		given().baseUri("http://localhost:3000").when().get("/employees").prettyPrint();

	}

	@Test(enabled = false)
	public void createAnEmployeeBDD() {
		HashMap<String, String> jsonObject = new HashMap<String, String>();
		jsonObject.put("first_name", "Nick");
		jsonObject.put("last_name", "Fury");
		jsonObject.put("email", "sheild@gmail.com");
		given().baseUri("http://localhost:3000").header("Content-Type", "application/json").body(jsonObject).when()
				.post("/employees").prettyPrint();

	}

	@Test(enabled = false)
	public void updateAnEmployeeBDD() {
		HashMap<String, String> jsonObject = new HashMap<String, String>();
		jsonObject.put("first_name", "Avenger");
		jsonObject.put("last_name", "Assemble");
		jsonObject.put("email", "sheild@gmail.com");
		given().baseUri("http://localhost:3000").header("Content-Type", "application/json").body(jsonObject).when()
				.put("/employees/17").prettyPrint();

	}

	@Test(enabled = false)
	public void deleteAnEmployeeBDD() {

		given().baseUri("http://localhost:3000")
				// .header("Content-Type","application/json")
				.when().delete("/employees/17").prettyPrint();

	}

	@Test(enabled = true)
	public void createEmployeeFromJsonFile() {
		File jsonFile = new File("postData.json");
		given().baseUri("http://localhost:3000").header("Content-Type", "application/json").body(jsonFile).when()
				.post("/employees").prettyPrint();

	}
}
