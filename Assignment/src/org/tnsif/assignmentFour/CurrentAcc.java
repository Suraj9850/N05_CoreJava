package org.tnsif.assignmentFour;

public class CurrentAcc extends BankAcc
{
	public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

	private float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	@Override
	public void withdraw(float amt) {
		if(amt<=getAccBal()+creditLimit)
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
		return "CurruentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + "]";
	}
}
