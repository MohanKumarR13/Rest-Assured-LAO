package com.ems.pojo_concepts;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee1 {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee();
		employee1.setFirstName("Boomer");
		employee1.setLastName("Uncle");
		employee1.setEmail("boomer@gmail.com");
		employee1.setskills(Arrays.asList("Java", "Selenium"));
		System.out.println(employee1.getFirstName());
		System.out.println(employee1.getLastName());
		System.out.println(employee1.getEmail());
		System.out.println(employee1.getskills());

		ObjectMapper mapper = new ObjectMapper();
		String employeeJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee1);
		System.out.println(employeeJson);
	}

}
