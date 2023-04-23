package com.ems.extra_concepts;

import com.ems.pojo_concepts.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

import io.restassured.common.mapper.TypeRef;

import static io.restassured.RestAssured.*;

import java.util.Map;

public class Deserialization {
	String json = "{\r\n" + "\"firstName\":\"Boomer\",\r\n" + "\"lastName\":\"Uncle\",\r\n"
			+ "\"email\":\"boomer@gmail.com\",\r\n" + "\"skills\":[\"java\",\"selenium\"]\r\n" + "}";

	public void usingObjectMapper() throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		Employee employee = mapper.readValue(json, Employee.class);
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getskills());
	}

	public void usingJaywayJsonPath() {
		JacksonMappingProvider mappingProvider = new JacksonMappingProvider();
		Configuration configuration = Configuration.builder().mappingProvider(mappingProvider).build();
		Employee employee = JsonPath.using(configuration).parse(json).read("$", Employee.class);
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getskills());
	}
	public void usingRestAssuredJsonPath() {
	io.restassured.path.json.JsonPath jsonPath=io.restassured.path.json.JsonPath.from(json);
	Employee employee=jsonPath.getObject("$", Employee.class);
	System.out.println(employee.getFirstName());
	System.out.println(employee.getLastName());
	System.out.println(employee.getEmail());
	System.out.println(employee.getskills());
	
	} 
	public void usingAsFunction() {
	Map<String, Object>response=given().baseUri("http://localhost:3000")
		.when().get("/employees/22").then().extract().body().as(new TypeRef <Map<String,Object>>(){
		});
	System.out.println(response);
	System.out.println(response.get("first_name"));
	System.out.println(response.get("last_name"));
	System.out.println(response.get("email"));
	System.out.println(response.get("Skills"));



	}

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		Deserialization deserialization = new Deserialization();
		/*deserialization.usingObjectMapper();
		deserialization.usingJaywayJsonPath();
		deserialization.usingRestAssuredJsonPath();*/
		deserialization.usingAsFunction();

	}

}
