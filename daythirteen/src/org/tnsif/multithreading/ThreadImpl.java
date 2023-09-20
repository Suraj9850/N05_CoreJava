package org.tnsif.multithreading;

public class ThreadImpl implements Runnable
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=15;i++)
		{
			System.out.print(i+"\t");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
