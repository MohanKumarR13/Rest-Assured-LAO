package com.lao.auth;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class ApiKeyAuth {
	@Test
	public void basicAuth() {
		given().when()
				.get("https://api.openweathermap.org/data/2.5/weather?q=London&appid=1c57163e3e5ec359a0e86c72a137ac46")
				.prettyPrint();
	}

	@Test
	public void apiKeyUsingParams() {
		given().queryParam("q", "London").queryParam("appid", "1c57163e3e5ec359a0e86c72a137ac46").when()
				.get("https://api.openweathermap.org/data/2.5/weather").then().log();

	}

	@Test
	public void apiKeyUsingHeaders() {
		given().queryParam("q", "London").header("appid", "1c57163e3e5ec359a0e86c72a137ac46").when()
				.get("https://api.openweathermap.org/data/2.5/weather").then().log();

	}
}
