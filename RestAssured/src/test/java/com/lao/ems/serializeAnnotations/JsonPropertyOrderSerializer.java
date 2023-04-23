package com.lao.ems.serializeAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertyOrderSerializer {
	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		JsonPropertyOrderPOJO getterPOJO=new JsonPropertyOrderPOJO();
		getterPOJO.setId(3);
		getterPOJO.setName("Mohan");
		getterPOJO.setEmail("mohan@gmail.com");
		
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getterPOJO);
		System.out.println(json);
	}
}
