package com.lao.auth;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class OAuth2 {
@Test
public void oAuth2() {
	
	String token="ghp_zNpEKQtHJdfhfd0QilZZCo2shfhG0TA0nhY8ZcX160r4Y";
	given()
	.auth()
	.oauth2(token)
	.when()
	.get("https://api.github.com/user/repos")
	.prettyPrint();
}
}
