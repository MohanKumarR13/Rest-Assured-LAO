package com.lao.deserializeAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonCreatorSerializer {
public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
	String json = "{\r\n" 
			+ "\"name\":\"Boomer\",\r\n" 
			+ "\"email\":\"boomer@gmail.com\",\r\n"
			+ "\"employeeId\":3\r\n" 
			+ "}";
	ObjectMapper mapper=new ObjectMapper();
	JsonCreatorPOJO creatorPOJO=mapper.readValue(json, JsonCreatorPOJO.class);
	System.out.println(creatorPOJO.getId());
	System.out.println(creatorPOJO.getName());
	System.out.println(creatorPOJO.getEmail());


}
}
