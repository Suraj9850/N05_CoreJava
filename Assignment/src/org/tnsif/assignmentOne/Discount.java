package org.tnsif.assignmentOne;

public class Discount 
{
	public double calculateDiscount(Bero bObj)
	{
		double discountAmt;
		if(bObj.getBeroType().equals("Steel Bero"))
		{
			discountAmt=(bObj.getPrice() * 10)/100;
			return discountAmt;
		}
		else if(bObj.getBeroType().equals("Wood Bero"))
		{
			discountAmt=(bObj.getPrice() * 15)/100;
			return discountAmt;
		}
		else
		{
			return 0;
		}
	}
}
