/*An interface with exactly one abstract method becomes Functional Interface. 
 * We don’t need to use @FunctionalInterface annotation to mark an interface as 
 * Functional Interface. @FunctionalInterface annotation is a facility 
 * to avoid accidental addition of abstract methods in the functional interfaces.
 * 
 * One of the major benefits of functional interface is the possibility to use lambda 
 * expressions to instantiate them.
 * */

package com.sachin4java.java8;

public class FunctionalInterface {

	public static void main(String[] args) {
		//using Lambada expression
		CustomFunctionalInterface customFunctionalInterface = () -> {
			System.out.println("customFunctionalInterface without param ");
			
		};
		customFunctionalInterface.m1();
		
		String name = "sachin";
		CustomFunctionalInterfaceWithParam customFunctionalInterfaceWithParam = (str) -> {
			System.out.println("customFunctionalInterface with param= "+str);
			return name;
			
		};
		customFunctionalInterfaceWithParam.m1("sachin");

	}

}


interface CustomFunctionalInterface{
	public void m1();
	//public void m2(String str);// if uncomment, it will give
	//The target type of this expression must be a functional in implementing classes 
}
interface CustomFunctionalInterfaceWithParam{
	public String m1(String str);
}
