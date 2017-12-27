package com.sachin4java.java5.varargs;

public class VarargsTest {

	public static void main(String[] args) {
		varArgsMethod(10,"sachin", "rane"); //first param int and 
											//rest will be assumed as varargs
		
		varArgsMethod(10,"sachin", "rane","aaaa","bbbb");//added more params but 
												//no extra overloaded method
	}

	private static void varArgsMethod(int val, String...varArgsParam) {
		System.out.println("\n**Iterating varargs");
		System.out.print(val + " ");
		for (String string : varArgsParam) {
			System.out.print(string+ " ");
		}
		
		
		
		
	}

}
