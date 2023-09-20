package org.tnsif.multithreading;

public class MyThreadchild extends Thread{
	public MyThreadchild()
	{
		start();
	}
	public void run()
	{
		System.out.println("Star With constructor "+Thread.currentThread().getName().toString());
		System.out.println(currentThread().isAlive());
	}
}
