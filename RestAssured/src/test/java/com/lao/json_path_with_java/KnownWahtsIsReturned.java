package com.lao.json_path_with_java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class KnownWahtsIsReturned {

	public static void main(String[] args) throws IOException {
		// Definite Path
		// Indefinite Path

		// .. Deep Scan
		// ?(Expression)
		// [0,1] or [0:2] [*]
		File jsonFile = new File("src/test/resources/bookstores.json");

		String author = JsonPath.read(jsonFile, "$.store.book[1].author");
		System.out.println(author);
		List<Object> authorList = JsonPath.read(jsonFile, "$.store.book[1,2].author");

		for (Object author1 : authorList) {
			System.out.println(author1);
		}

	}

}
