package org.tnsif.assignmentFour;

public class MMSavingAcc extends SavingAcc
{
	private float MINBAL=1000;
	public MMSavingAcc(int accNo, String accNm, float accBal, Boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}
	
	public void withdraw(float amt)
	{
		super.withdraw(amt);
	}
	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + "]";
	}
	
}
