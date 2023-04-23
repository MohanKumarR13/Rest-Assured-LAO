package com.lao.ems.serializeAnnotations;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonRootSerializer {
	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		JsonRootPOJO JsonRootPOJO=new JsonRootPOJO();
		JsonRootPOJO.setFirstName("Mohan");
		JsonRootPOJO.setLastName("Kumar");
		JsonRootPOJO.setEmail("mohan@gmail.com");
		JsonRootPOJO.setSkills(Arrays.asList("Java","Selenium"));
		

		ObjectMapper mapper=new ObjectMapper();
		mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(JsonRootPOJO);
		System.out.println(json);
	}
}