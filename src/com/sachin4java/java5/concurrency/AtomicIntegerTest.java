package com.sachin4java.java5.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread runnable = new MyThread();
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		t1.start();
		t2.start();
		
		
		
		System.out.println("nonAtomic val="+runnable.getNonAtomic());
		//the above output will be varying between 5 to 10, to get expected output 
		//we will need to synchronize the nonAtomic++ operation
		
		System.out.println("Atomic val="+runnable.getAomic());
		//The above output always be as expected. 
		//No need to synchronize increment operation
		
		t1.join();
		t2.join();
		
	}
	

}

class MyThread implements Runnable{
	int nonAtomic =0;
	AtomicInteger atomicInteger=new AtomicInteger(0);  
	
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			nonAtomic++;
		}

		for (int i = 0; i < 5; i++) {
			atomicInteger.incrementAndGet();
		}
	}
	
	public int getNonAtomic() {
		return nonAtomic;
	}
	public AtomicInteger getAomic() {
		return atomicInteger;
	}
}