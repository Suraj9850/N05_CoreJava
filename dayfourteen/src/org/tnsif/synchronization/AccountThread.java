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
			acc.deposit(amount);
			acc.withdraw(amount);
		} catch (DepositLimitExceedException e) {
			e.printStackTrace();
		} catch (InsufficentBalanceException e) {
			e.printStackTrace();
		}
	}
	
}
