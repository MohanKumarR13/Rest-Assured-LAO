package com.lao.ems.serializeAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValuePOJOSerializer {
	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		JsonValuePOJO JsonValuePOJO=new JsonValuePOJO();
		JsonValuePOJO.setId(12);
		JsonValuePOJO.setFirstName("Mohan");
		JsonValuePOJO.setLastName("Kumar");
		JsonValuePOJO.setEmail("mohan@gmail.com");
		
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(JsonValuePOJO);
		System.out.println(json);
	}
}
