package com.lao.auth;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
public class BearerTokenAuth {
@Test
public void bearerTokenAuth() {
	String token="ghp_zNpEKQtHJ0Qi2224wrwwrlZZCo2sfsfG0TA0nhY8ZcX160r4Y";
	given()
	.header("Authorization","Bearer"+token)
	.when()
	.get("https://api.github.com/user/repos")
	.prettyPrint();
}
}
