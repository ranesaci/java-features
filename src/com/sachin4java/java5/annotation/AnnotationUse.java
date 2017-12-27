package com.sachin4java.java5.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationUse {
	//Use of custom annotation
	@MyCustomAnnotation(name="Sachin1", city="Pune", age=30)
	public void m1() {
		System.out.println("m1()");
	}
	
	
	//Use of custom annotation
	@MyCustomAnnotation(name="Sachin2", city="Pune")
	public void m2() {
		System.out.println("m2()");
	}
	
	public static void main(String[] args) throws SecurityException, ClassNotFoundException {
		
		parseAnnotations();//analyze annotations using reflection
		
	}


	private static void parseAnnotations() throws SecurityException, ClassNotFoundException {
		
		//get all methods of AnnotationUse class
		
		Method[] methods = AnnotationUse.class.getClassLoader()
				.loadClass(("com.sachin4java.annotation.AnnotationUse")).getMethods();
		
		//Iterate methods
		
		for (Method method : methods) {
			//check if annotation available on method
			if(method.isAnnotationPresent(MyCustomAnnotation.class)) {
				
				//traverse through all annotations on method
				for(Annotation annotation : method.getDeclaredAnnotations()) {
					
					MyCustomAnnotation myCustomAnnotation = method.getAnnotation(MyCustomAnnotation.class);
					System.out.println("Method Name="+method.getName() +" >>Name ="+myCustomAnnotation.name()+" City ="+myCustomAnnotation.city()+" Age ="+myCustomAnnotation.age());
				
				
			}
			
		}
		
	}
}
	
}