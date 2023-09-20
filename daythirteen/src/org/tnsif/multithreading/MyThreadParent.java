package org.tnsif.multithreading;

public class MyThreadParent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThreadchild t1,t2;
		t1=new MyThreadchild();
		t2=new MyThreadchild();
		t1.join();
		t2.join();
		System.out.println("----------------End-------------------");
		System.out.println(t1.isAlive()+" "+t2.isAlive()+" "+Thread.currentThread().isAlive());
	}

}
