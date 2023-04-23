package com.lao.json_path_with_java;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;
import static com.jayway.jsonpath.Filter.*;
import static com.jayway.jsonpath.JsonPath.*;

import static com.jayway.jsonpath.Criteria.*;

public class FilterPredicateExample {
	static File jsonFile = new File("src/test/resources/bookstores.json");

	public void filterPredicateExample() throws IOException {
		Filter priceLesThan = Filter.filter(Criteria.where("price").lt(10));
		List<Object> reslut = JsonPath.parse(jsonFile).read("$.store.book[?]", priceLesThan);
		System.out.println(reslut);
	}

	public void secondFilter() throws IOException {
		Filter secondFilter = Filter.filter(Criteria.where("price").lt(10).and("category").is("fiction"));
		List<Map<Object, String>> reslut = JsonPath.parse(jsonFile).read("$.store.book[?]", secondFilter);
		System.out.println(reslut.get(0).get("author"));
	}

	public void thirdFilter() throws IOException {
		Filter thirdFilter = filter(where("price").gt(10).and("category").is("fiction"));
		List<Map<Object, String>> reslut = JsonPath.parse(jsonFile).read("$.store.book[?]", thirdFilter);
		System.out.println(reslut);
	}

	public static void main(String[] args) throws IOException {

		FilterPredicateExample example = new FilterPredicateExample();
		example.filterPredicateExample();
		example.secondFilter();
		example.thirdFilter();

	}

}
