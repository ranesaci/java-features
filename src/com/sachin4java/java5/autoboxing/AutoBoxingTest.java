package com.sachin4java.java5.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingTest {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>();
		for (int i = 1; i < 5; i++)
		    li.add(i);//converting i primitive to wrapper automatically(AutoBoxing)
		
		for (Integer integer : li) {
			int i = integer;//conerting wrapper to primituive(Unboxing)
			System.out.print(i+" ");
			
		}
	}

}
