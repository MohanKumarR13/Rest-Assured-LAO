package com.ems.json_schema_validation;

import java.io.File;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class RestAssuredJsonSchemaValidation {
	@Test(enabled = false)
	public void validationUsingJsonSchemaInClassPath() {
		File inputJson = new File("src/test/resources/input.json");
		RestAssured.given().baseUri("http://localhost:3000").header("Content-Type", "application/json").body(inputJson)
				.when().post("/employees").then().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
	}

	@Test
	public void validationUsingMatchesJsonSchema() throws FileNotFoundException {
		File inputJson = new File("src/test/resources/input.json");
		RestAssured.given().baseUri("http://localhost:3000").header("Content-Type", "application/json").body(inputJson)
				.when().post("/employees").then()
				.body(JsonSchemaValidator.matchesJsonSchema("{\r\n"
						+ "  \"$schema\": \"http://json-schema.org/draft-04/schema#\",\r\n"
						+ "  \"type\": \"object\",\r\n" + "  \"properties\": {\r\n" + "    \"first_name\": {\r\n"
						+ "      \"type\": \"string\"\r\n" + "    },\r\n" + "    \"last_name\": {\r\n"
						+ "      \"type\": \"string\"\r\n" + "    },\r\n" + "    \"email\": {\r\n"
						+ "      \"type\": \"string\"\r\n" + "    },\r\n" + "    \"Skills\": {\r\n"
						+ "      \"type\": \"array\",\r\n" + "      \"items\": [\r\n" + "        {\r\n"
						+ "          \"type\": \"string\"\r\n" + "        },\r\n" + "        {\r\n"
						+ "          \"type\": \"string\"\r\n" + "        }\r\n" + "      ]\r\n" + "    },\r\n"
						+ "    \"id\": {\r\n" + "      \"type\": \"integer\"\r\n" + "    }\r\n" + "  },\r\n"
						+ "  \"required\": [\r\n" + "    \"first_name\",\r\n" + "    \"last_name\",\r\n"
						+ "    \"email\",\r\n" + "    \"Skills\",\r\n" + "    \"id\"\r\n" + "  ]\r\n" + "}"));
	}

}
