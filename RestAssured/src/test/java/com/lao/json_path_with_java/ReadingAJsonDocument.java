package com.lao.json_path_with_java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class ReadingAJsonDocument {

	
	public static void readAJson() throws IOException {
		File jsonFile=new File("src/test/resources/bookstore.json");
		
	List<Object>priceList=JsonPath.read(jsonFile,"$..Price");
	
	for(Object price:priceList) {
		System.out.println(price);
	}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readAJson();
	}

}
