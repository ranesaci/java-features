package com.sachin4java.java8;

import javax.print.DocFlavor.STRING;

/*

Default methods in interfaces help us to introduce new functionality without 
breaking the contract of the implementing classes.

Static method works as a utility method
*/
public class DefaultStaticMethod {

	public static void main(String[] args) {
	
		DefaultStaticImpl  defaultStatic = new DefaultStaticImpl();
		String str = defaultStatic.m1();
		System.out.println(str);

	}

}



interface DefaultStatic{
	default String defaultMethod(String str) {
		String s = StaticMethod(str);
		return s + "--> from defaultMethod";
		
	}

	static String StaticMethod(String str) {
		return str + "--> from StaticMethod";
		
	}
	
}

class DefaultStaticImpl implements DefaultStatic{
	
	public String m1() {
		String str = defaultMethod("sachin");
		return str;
	}
	
	
}