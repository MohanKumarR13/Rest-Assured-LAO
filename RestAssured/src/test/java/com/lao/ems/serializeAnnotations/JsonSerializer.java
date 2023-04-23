package com.lao.ems.serializeAnnotations;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class JsonSerializer {
	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		JsonSerializePOJO JsonSerializePOJO=new JsonSerializePOJO();
		JsonSerializePOJO.setFirstName("Mohan");
		JsonSerializePOJO.setLastName("Kumar");
		JsonSerializePOJO.setEmail("mohan@gmail.com");
		JsonSerializePOJO.setSkills(Arrays.asList("Java","Selenium"));
		
		Devices devices=new Devices();
		devices.setLaptop("Acer");
		devices.setMobile("Nokia");
		JsonSerializePOJO.setDevices(devices);
		
		ObjectMapper mapper=new ObjectMapper();
	/*	SimpleModule module=new SimpleModule();
		module.addSerializer(JsonSerializePOJO.class,new CustomSerializer());
		mapper.registerModule(module);*/
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(JsonSerializePOJO);
		System.out.println(json);
	}
}