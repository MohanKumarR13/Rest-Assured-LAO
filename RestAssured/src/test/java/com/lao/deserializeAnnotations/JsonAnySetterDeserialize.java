package com.lao.deserializeAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnySetterDeserialize {
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
	String json = "{\r\n" + "\"firstName\":\"Boomer\",\r\n" + "\"lastName\":\"Uncle\",\r\n"
			+ "\"email\":\"boomer@gmail.com\",\r\n" + "\"skills\":[\"java\",\"selenium\"]\r\n" + "}";
ObjectMapper mapper=new ObjectMapper();
JsonAnySetterPOJO pojo=mapper.readValue(json, JsonAnySetterPOJO.class);
System.out.println(pojo.getEmployee());
}
}