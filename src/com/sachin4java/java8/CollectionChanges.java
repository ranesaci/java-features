package com.sachin4java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Predicate;

public class CollectionChanges {

	public static void main(String[] args) {
		/*forEachRemaining() method takes an action on each element of the collection that has 
		 * not been accessed by the iterator yet.*/
		List<String> list = Arrays.asList("Sachin,Rane,Pune".split(","));
		
		//using forEachRemaining()
		System.out.println("using forEachRemaining()");
		Iterator<String> iterator = list.iterator();
		iterator.forEachRemaining(System.out::println);
		
		
		//using removeIf
		System.out.println("using removeIf");
		List<String> removeIfList = new ArrayList<>(list);//deep cloning of list
		Predicate<String> predicate = p -> p.contains("Pune");
		removeIfList.removeIf(predicate);
		removeIfList.forEach(p -> System.out.println(p));
		
		
		//spliterator // to divide the list to process in parallel
		System.out.println("Using spliteratorList***");
		List<String> spliteratorList = new ArrayList<>(list);//deep cloning of list
		spliteratorList.add("abc");

		  Spliterator<String> s = spliteratorList.spliterator();
		  Spliterator<String> s1 = s.trySplit();

		  s.forEachRemaining(System.out::println);
		  System.out.println("-- traversing the other half of the spliterator --- ");
		  s1.forEachRemaining(System.out::println);
		  
		  //map
		  
		  Map<String, String> map = new HashMap<>();
		  map.put("fname", "Sachin");
		  map.put("lname", "Rane");
		  map.put("city", "Pune");
		  
		  System.out.println("Iterate map******");
		  map.forEach((k,v) -> System.out.println("Key="+k + " and Value="+v));
		  
		  //compute
		  System.out.println("Using compute");
		  
		  map.compute("fname", (k,v)-> v != null ? "sachinNotNull":"SachinNull");
		  System.out.println(map);
		  
		  //merge
		  System.out.println("Using merge");
		  map.merge("city", " concat city", String::concat);
		  System.out.println(map);
		  map.merge("country", "india", String::concat);
		  System.out.println(map);
		  
		
	}

}
