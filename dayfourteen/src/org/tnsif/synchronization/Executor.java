package org.tnsif.synchronization;

public class Executor {

	public static void main(String[] args){
		
		Account a=new Account(101,"Abc",10000); 
		
		AccountThread t1=new AccountThread(a,5000);
		AccountThread t2=new AccountThread(a,20000);
		
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
