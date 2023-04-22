package com.lao.json_path_with_java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class ReadingAJsonDocument {

	public static void parsesEveryTime() throws IOException {
		File jsonFile = new File("src/test/resources/bookstore.json");

		List<Object> priceList = JsonPath.read(jsonFile, "$..Price");

		for (Object price : priceList) {
			System.out.println(price);
		}
	}

	public static void parsesOneTime() throws IOException {
		InputStream jsonFile = new FileInputStream("src/test/resources/bookstore.json");
		Object parsedJsonDoc = Configuration.defaultConfiguration().jsonProvider().parse(jsonFile.readAllBytes());
		List<Object> priceList = JsonPath.read(parsedJsonDoc, "$..Price");
		for (Object price : priceList) {
			System.out.println(price);
		}

	}

	public static void fluentAPI() throws IOException {
		File jsonFile = new File("src/test/resources/bookstores.json");
		DocumentContext context = JsonPath.parse(jsonFile);
		List<Object> priceList = (context.read("$..Price"));
		for (Object price : priceList) {
			System.out.println(price);
		}
		Configuration configuration = Configuration.defaultConfiguration();
		JsonPath.using(configuration).parse(jsonFile).read(("$..Price"));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		fluentAPI();
	}

}
