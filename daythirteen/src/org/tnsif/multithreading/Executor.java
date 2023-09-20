package org.tnsif.multithreading;

public class Executor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main ... "+Thread.currentThread());
		ChildThread t1=new ChildThread();
		t1.run();//
		//if we call run method manually it will work as normally single threaded app it will create main as a thread
	}
}