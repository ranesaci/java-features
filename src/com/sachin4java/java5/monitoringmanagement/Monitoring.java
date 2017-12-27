package com.sachin4java.java5.monitoringmanagement;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ThreadMXBean;

public class Monitoring {

	public static void main(String[] args) {
		// Get the managed bean for the thread system of the Java
        // virtual machine.
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        // Get the peak live thread count since the Java virtual
        // machine started or peak was reset.
        int peakThreadCount = bean.getPeakThreadCount();
        System.out.println("Peak Thread Count = " + peakThreadCount);
        
        // Get the current number of live threads including both
        // daemon and non-daemon threads.
        int threadCount = bean.getThreadCount();
        System.out.println("Thread Count = " + threadCount);
        
        //GetClassPath
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        String classPath = runtimeMXBean.getClassPath();
        System.out.println("ClassPath = " + classPath);
        

	}
	
}
