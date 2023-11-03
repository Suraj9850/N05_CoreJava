package org.tnsif.assignmentFour;

public abstract class BankFactory {
	public SavingAcc getNewSavingAcc(int AccNo,String accNm,float accBal,Boolean isSalaried)
	{
		return new SavingAcc(AccNo, accNm, accBal, isSalaried);
	}
	public CurrentAcc getNewCurrentAcc(int AccNo,String accNm,float accBal,int creditLimit)
	{
		return new CurrentAcc(AccNo, accNm, accBal, creditLimit);
	}
}
