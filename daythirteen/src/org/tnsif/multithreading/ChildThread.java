package org.tnsif.multithreading;

public class ChildThread extends Thread {
	 public void run() 
	 {
		 for(int i=0;i<2;i++) {
			 System.out.println("Hello:"+Thread.currentThread());
//			 ThreadDemo.printHello();
		 }
	 }
}