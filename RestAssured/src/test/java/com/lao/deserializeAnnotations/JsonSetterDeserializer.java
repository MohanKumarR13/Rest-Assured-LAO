package com.lao.deserializeAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSetterDeserializer {
public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
	String json = "{\r\n" 
			+ "\"name\":\"Boomer\",\r\n" 
			+ "\"email\":\"boomer@gmail.com\",\r\n"
			+ "\"employeeId\":3\r\n" 
			+ "}";
	ObjectMapper mapper=new ObjectMapper();
	JsonSetterPOJO jsonSetterPOJO=mapper.readValue(json, JsonSetterPOJO.class);
	System.out.println(jsonSetterPOJO.getId());
}
}
