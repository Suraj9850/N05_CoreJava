package org.tnsif.synchronization;

public interface Bank {
		//by
		int DEPOSIT_LIMIT=25000;
		static final int MINIMUM_BALANCE=1000;
		public abstract void deposit(int amount)throws DepositLimitExceedException;
		public abstract void withdraw(int amount)throws InsufficentBalanceException;
}
