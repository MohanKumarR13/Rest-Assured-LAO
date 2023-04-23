package com.lao.deserializeAnnotations;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class JacksonInjectDeserializer {

	public static void main(String[] args) throws IOException {
		String json = "{\r\n" 
				+ "\"name\":\"Boomer\",\r\n" 
				+ "\"email\":\"boomer@gmail.com\",\r\n"
				+ "\"id\":3\r\n" 
				+ "}";
		InjectableValues injectableValues=new InjectableValues.Std().addValue(String.class, "Mohan");
		
		
			ObjectMapper mapper=new ObjectMapper();
			ObjectReader reader=mapper.reader(injectableValues);
			JacksonInjectPOJO injectPOJO=reader.readValue(json,JacksonInjectPOJO.class);
			System.out.println(injectPOJO.getName());


		}
	

	}

