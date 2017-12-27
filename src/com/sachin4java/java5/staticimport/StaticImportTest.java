package com.sachin4java.java5.staticimport;

//adding below STATIC IMPORT, So we can use StaticImport class members
// that of this class
import static com.sachin4java.java5.staticimport.StaticImport.*;

public class StaticImportTest {

	public static void main(String[] args) {
		System.out.println(STATIC_IMPORT_VAL);//direct use of STATIC_IMPORT_VAL
		System.out.println(staticImportSum(10, 20));//direct use of staticImportSum method

	}

}
