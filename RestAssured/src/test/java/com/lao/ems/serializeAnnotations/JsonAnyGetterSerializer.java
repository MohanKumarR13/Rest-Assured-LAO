package com.lao.ems.serializeAnnotations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnyGetterSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		JsonAnyGetterPOJO anyGetterPojo=new JsonAnyGetterPOJO();
		Map<String, Object>mapValue=new HashMap<String, Object>();
		mapValue.put("firstName", "Mohan");
		mapValue.put("lastName", "Kumar");
		mapValue.put("email", "mohan@gmail.com");
		mapValue.put("skills",Arrays.asList("Java","Selenium"));
		anyGetterPojo.setEmployee(mapValue);
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(anyGetterPojo);
		System.out.println(json);

	}

}
