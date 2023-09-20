package org.tnsif.multithreading;

public class RunnableDemo {

	public static void main(String[] args) throws InterruptedException {
		// !st way
		ThreadImpl implObj=new ThreadImpl();
		Thread thread1=new Thread(implObj);
		thread1.start();
		
		//2nd way anynomys class
		Runnable obj=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				char ch='A';
				for(int i=1;i<=26;i++,ch++)
				{
					System.out.print(ch+"\t");
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2=new Thread(obj);
		t2.start();
		
		
		//3rd way using lambda function
		Runnable obj1=() -> 
		{
			for(int i=1;i<=100;i+=2)
			{
				System.out.print(i+"\t");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t3=new Thread(obj1);
		t3.start();
		
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName()+"-----------------------------------------------------------------");
	}

}
