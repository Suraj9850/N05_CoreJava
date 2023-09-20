package org.tnsif.multithreading;

public class Operations {
	static void printHello() {
		System.out.println("printHello : "+Thread.currentThread());
		for(int i=0;i<2;i++)
		{
			System.out.println("Hello World!");			
		}
	}
	static void printOdd() {
		for(int i=1;i<=10;i+=2) 
			System.out.println(i);
		System.out.println(" printOdd: "+Thread.currentThread());
		
	}
}
