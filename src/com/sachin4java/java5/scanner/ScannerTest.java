package com.sachin4java.java5.scanner;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws FileNotFoundException {
		 // Initialize Scanner object
	    Scanner scanner = new Scanner(ScannerTest.class.getResourceAsStream("./scanner.txt"));
	    
	    while(scanner.hasNext()){
	    	// initialize the string delimiter
	    	Scanner scan = new Scanner(scanner.nextLine());
		    scan.useDelimiter("-");
		    System.out.println("***Printing line***");
		    while (scan.hasNext()) {
		    	// Printing the tokenized Strings
				System.out.println(scan.next());
				
			}
		    scan.close();
	        
	    }
	    // closing the scanner stream
	    scanner.close();
	}
		
}
