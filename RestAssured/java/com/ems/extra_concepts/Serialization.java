package com.ems.extra_concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Serialization {
	// Data is Obtained
	@Test
	public void serialization() {
		Map<String, Object> jsonBody = new HashMap<String, Object>();

		List<String> skills = new ArrayList<String>();
		skills.add("Java");
		skills.add("Selenium");
		jsonBody.put("first_name", "Green");
		jsonBody.put("last_name", "Goblin");
		jsonBody.put("email", "greengoblin@gmail.com");

		jsonBody.put("Skills", skills);

		System.out.println(jsonBody);
		given().baseUri("http://localhost:3000").header("Content-Type", "application/json").body(jsonBody).log().all()
				.when().post("/employees").then().log().all();

	}
}