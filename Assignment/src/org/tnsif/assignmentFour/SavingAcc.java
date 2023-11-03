package org.tnsif.assignmentFour;



public class SavingAcc extends BankAcc
{
	
	private Boolean isSalaried;
	private static final float MINBAL = 1000;
	public SavingAcc(int accNo, String accNm, float accBal, Boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	@Override
	public void withdraw(float amt) {
		if(amt<=MINBAL+getAccBal())
		{
			setAccBal(getAccBal()-amt);
			System.out.println(amt+" is withdraw Updated Balance:"+getAccBal());
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	@Override
	public void deposite(float amt) {
		setAccBal(getAccBal()+amt);
		System.out.println(amt+" is deposited Updated Balance:"+getAccBal());
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", toString()=" + super.toString() + "]";
	}
}
