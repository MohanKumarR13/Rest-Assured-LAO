package com.lao.ems.serializeAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRawValuePOJOSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		JsonRawValuePOJO RawValuePOJO=new JsonRawValuePOJO();
		RawValuePOJO.setId(12);
		RawValuePOJO.setFirstName("Mohan");
		RawValuePOJO.setLastName("Kumar");
		RawValuePOJO.setEmail("mohan@gmail.com");
		
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(RawValuePOJO);
		System.out.println(json);
	}
}
