package org.tnsif.assignmentFour;

public class MMCurrentAcc extends CurrentAcc
{
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}
	public void withdraw(float amt)
	{
		super.withdraw(amt);
	}
	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + "]";
	}
	
}
