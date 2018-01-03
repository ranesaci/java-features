package com.sachin4java.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

//It is implemented in Iterable  interface
// logic for iteration and business logic at separate place resulting in higher 
//separation of concern and cleaner code.

public class ForEachIterator {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("sachin,rane,pune".split(","));
		
		//Old approach
		System.out.println("Using iterator loop*******");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		
		//NEw for each loop in java 8
		System.out.println("Using new ForEach loop*******");
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		});
		
		//NEw for each loop in java 8
				System.out.println("Using new ForEach loop with custom consumer*******");
				list.forEach(new CustomConsumer());
		

	}

}

class CustomConsumer implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t + " --> from custom consumer");
		
	}
	
}
