package com.ems.pojo_concepts;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializeAndDeseialize {
	ObjectMapper mapper = new ObjectMapper();
	String employeeJson;

	public void serialize() throws JsonProcessingException {
		Employee employee1 = new Employee();
		employee1.setFirstName("Boomer");
		employee1.setLastName("Uncle");
		employee1.setEmail("boomer@gmail.com");
		employee1.setskills(Arrays.asList("Java", "Selenium"));

		employeeJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee1);
		System.out.println(employeeJson);
	}

	public void deSerialize() throws JsonMappingException, JsonProcessingException {
		String employeeJson = "{\r\n" + "\"firstName\":\"Boomer\",\r\n" + "\"lastName\":\"Uncle\",\r\n"
				+ "\"email\":\"boomer@gmail.com\",\r\n" + "\"skills\":[\"java\",\"selenium\"]\r\n" + "}";

		Employee obj = mapper.readValue(employeeJson, Employee.class);
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
		System.out.println(obj.getEmail());
		System.out.println(obj.getskills());
		System.out.println(employeeJson);
	}

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		SerializeAndDeseialize serializeAndDeseialize = new SerializeAndDeseialize();
		serializeAndDeseialize.serialize();
		serializeAndDeseialize.deSerialize();

	}

}
