package com.sachin4java.java8;

import java.util.Arrays;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		

		List<String> list  = Arrays.asList("sachin,rane,pune".split(","));
		
		//using lambada expression to sort list items
		list.sort((String s1, String s2) -> s1.compareTo(s2));//sorting in ascending order
		
		list.forEach(System.out::println);
	}

}
