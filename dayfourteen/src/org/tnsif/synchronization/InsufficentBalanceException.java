package org.tnsif.synchronization;

public class InsufficentBalanceException extends Exception
{
	public InsufficentBalanceException() {
		super("Minimum balance for withdraw");
	}
	public InsufficentBalanceException(String msg) {
		super(msg);
	}
}
