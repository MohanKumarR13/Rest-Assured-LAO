package com.lao.json_path_with_java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class InlinePredicateExample {
	File jsonFile = new File("src/test/resources/bookstores.json");

	public void inLinePredicateExample() throws IOException {
		//$.store[?(@.price<10)]
	List<Object>result=	JsonPath.parse(jsonFile).read("$.store.book[?(@.price<10)].price");
	//Price Less than 10 and Category=Fiction
	//[?(@.price<10 && @.category=='fiction')]")
	List<Object>result1=JsonPath.parse(jsonFile).read("$.store.book[?(@.price<10 && @.category=='fiction')]");
	//Price >10 || Category=reference
	//[?(@.price>10 || @.category=='reference')]
	List<Object>result2=JsonPath.parse(jsonFile).read("$.store.book[?(@.price>10 || @.category=='reference')]");
	//Negation
	List<Object>result3=JsonPath.parse(jsonFile).read("$.store.book[?(!(@.price>10 || @.category=='reference'))]");

	System.out.println(result);
	System.out.println(result1);
	System.out.println(result2);
	System.err.println(result3);

	}

	public static void main(String[] args) throws IOException {
		InlinePredicateExample example=new InlinePredicateExample();
		example.inLinePredicateExample();

	}

}
