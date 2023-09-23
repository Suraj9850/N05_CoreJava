package org.tnsif.synchronization;

public class AccountThread extends Thread
{
	Account acc;
	int amount;
	public AccountThread()
	{
		
	}
	public AccountThread(Account acc, int amount) {
		super();
		this.acc = acc;
		this.amount = amount;
	}
	public void run()
	{
		try {
			synchronized (acc) {
				acc.withdraw(amount);
			}
//			acc.deposit(amount);
		} 
//			catch (DepositLimitExceedException e) {
//			e.printStackTrace();
//		} 
		catch (InsufficentBalanceException e) {
			e.printStackTrace();
		}
	}
	
}
