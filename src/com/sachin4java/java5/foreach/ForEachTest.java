	package com.sachin4java.java5.foreach;
	
	import java.util.Arrays;
	import java.util.List;
	
	public class ForEachTest {
	
		public static void main(String[] args) {
			
			List<String> list = Arrays.asList("sachin", "rane", "pune");
			
			System.out.println("***Using old for loop ***");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i)+ " ");
				
			}
			
			System.out.println("\n ***Using old for loop***");
			for (String str : list) {
				System.out.print(str+ " ");
				
			}
			
		}
	
	}
