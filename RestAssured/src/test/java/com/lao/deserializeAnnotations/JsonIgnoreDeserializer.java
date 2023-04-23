package com.lao.deserializeAnnotations;

import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIgnoreDeserializer {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		String json;
		JsonIgnorePOJO ignorePOJO=new JsonIgnorePOJO();
		ignorePOJO.setName(null);
		ignorePOJO.setId(2);
		ignorePOJO.setEmail(null);
		Date date =new Date();
		ignorePOJO.setDateOfBirth(date);
		
		ObjectMapper mapper=new ObjectMapper();
		json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(ignorePOJO);
		System.out.println(json);
	}

}
