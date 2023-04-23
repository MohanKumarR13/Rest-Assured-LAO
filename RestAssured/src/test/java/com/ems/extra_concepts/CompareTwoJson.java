package com.ems.extra_concepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CompareTwoJson {
	static String json1 = "{\r\n" + "\"firstName\":\"Boomer\",\r\n" + "\"lastName\":\"Uncle\",\r\n"
			+ "\"email\":\"boomer@gmail.com\",\r\n" + "\"skills\":[\"java\",\"selenium\"]\r\n" + "}";
	static String json2 = "{\r\n" + "\"lastName\":\"Uncle\",\r\n" + "\"firstName\":\"Boomer\",\r\n"
			+ "\"email\":\"boomer@gmail.com\",\r\n" + "\"skills\":[\"selenium\",\"java\"]\r\n" + "}";

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		ObjectMapper mapper=new ObjectMapper();
		JsonNode jsonNode1=mapper.readTree(json1);
		JsonNode jsonNode2=mapper.readTree(json2);
		
		System.out.println(jsonNode1.equals(jsonNode2));

	}

}
