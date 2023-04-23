package com.lao.auth;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class BasicAuth {
	@Test
	public void basicAuth() {
		given()
		.auth()
		.basic("postman", "password")
		.baseUri("https://postman-echo.com/").when().get("basic-auth").prettyPrint();
	}
}
