package org.tnsif.assignmentFour;


public class MMBankFactory extends BankFactory
{
	public MMSavingAcc getNewSavingAcc(int AccNo,String accNm,float accBal,Boolean isSalaried)
	{
		return new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
	}
	public MMCurrentAcc getNewCurrentAcc(int AccNo,String accNm,float accBal,int creditLimit)
	{
		return new MMCurrentAcc(AccNo, accNm, accBal, creditLimit);
	}
}
