package com.sachin4java.java5.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest {
	private static List nonGenericlist = new ArrayList();
	private static List<String> genericlist = new ArrayList<String>();
	
	public static void main(String[] args) {
		//nonGenericlist items add
		nonGenericlist.add("sachin");
		nonGenericlist.add("rane");
		//nonGenericlist.add(123); //list accept integer also which should not be allowed if we want type only Strings
		
		Iterator nonGenericIterator = nonGenericlist.iterator();
		while (nonGenericIterator.hasNext()) {
			String value = (String) nonGenericIterator.next(); //needs to do casting otherwise comiple error
			System.out.println(value);
			
		}
		
		System.out.println("******************************");
		
		//Genericlist items add
		genericlist.add("sachin");
		genericlist.add("rane");
		//genericlist.add(123); //if we uncomment this, it will give compile error
		

		Iterator<String> genericIterator = nonGenericlist.iterator();
		while (genericIterator.hasNext()) {
			String value = genericIterator.next(); //No Need to typecast 
			System.out.println(value);
			
		}
	}	

}
