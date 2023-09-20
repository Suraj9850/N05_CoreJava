package org.tnsif.multithreading;

public class ThreadDemo {
	
	public static void main(String[] args) {
		//  In every java program their is always a one thread running in background known as a main thread or background thread
		Thread t= Thread.currentThread();
		System.out.println(t.getName());
		//when we print directly object that time toString() method is executed by default.
		System.out.println(t);
		Operations.printHello(); 
		System.out.println(Thread.currentThread());
		Operations.printOdd();
		ChildThread t1=new ChildThread();
		t1.start();
		ChildThread t2=new ChildThread();
		t2.start();
		ChildThread t3=new ChildThread();
		t3.start();
		// we can't call start method multiple time it throw an exceptions 
	}
}