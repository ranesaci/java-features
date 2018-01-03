/*perform filter/map/reduce like operations with the collection. Stream API will allow 
 * sequential as well as parallel execution. */

package com.sachin4java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//sequential stream 
		
		System.out.println("Using sequential stream ");
		Stream<Integer> seqStream = list.stream();
		seqStream.forEach(p -> System.out.println(p));
		
		//parallel stream 
		
		System.out.println("Using parallel stream ");
		Stream<Integer> parallelStream = list.parallelStream();
		parallelStream.forEach(p -> System.out.println(p));
		
		//sequential stream 
		
		System.out.println("Using sequential stream filter ");
		Stream<Integer> seqStreamFiletr = list.stream().filter(p -> p>5);
		seqStreamFiletr.forEach(p -> System.out.println(p));
				
		//parallel stream 
		System.out.println("Using parallel stream filter ");
		Stream<Integer> parallelStreamFilter =list.parallelStream().filter(p -> p>5);
		parallelStreamFilter.forEach(p -> System.out.println(p));		
		

	}

}
