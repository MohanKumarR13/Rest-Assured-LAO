package com.lao.deserializeAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAliasDeserializer {
public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
	String json = "{\r\n" 
			+ "\"name\":\"Boomer\",\r\n" 
			+ "\"email\":\"boomer@gmail.com\",\r\n"
			+ "\"id\":3\r\n" 
			+ "}";
/*	ObjectMapper mapper=new ObjectMapper();
	JsonAliasPOJO aliasPOJO=mapper.readValue(json, JsonAliasPOJO.class);*/
	JsonAliasPOJO aliasPOJO=new ObjectMapper().readerFor(JsonAliasPOJO.class).readValue(json);
	System.out.println(aliasPOJO.getId());
}
}
