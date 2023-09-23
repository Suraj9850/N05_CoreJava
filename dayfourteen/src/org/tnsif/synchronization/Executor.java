package org.tnsif.synchronization;

public class Executor {

	public static void main(String[] args){
		
		Account ac=new Account(101,"Amit",10000); 
		System.out.println("Orignal Balance:"+10000);
		AccountThread t1=new AccountThread(ac,5000);
		AccountThread t2=new AccountThread(ac,200);
		
		//With Thread
		t1.start();
		t2.start();
		
		//Without Thread
//		try {
//			a.deposit(5000);
//			a.withdraw(500);
//		} catch (DepositLimitExceedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InsufficentBalanceException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
