package org.tnsif.assignmentOne;

//Calculating the discount on the bero	Discount	public double calculateDiscount(Bero bObj)	This method is used to calculate the discount for the bero objects and return the discount amount
//If the object is SteelBero then the discount should be 10%
//If the object is WoodenBero then the discount should be 15%
//Example:
//If the object is SteelBero, price = 5000, then the discount will be:
//Discount = (price * 10) /100
//               = (5000 * 10) / 100
//Discount = 500

public class Discount 
{
	public double calculateDiscount(Bero bObj)
	{
		double discount;
		if(bObj.getBeroType().equals("Steel Bero"))
		{
			discount=(bObj.getPrice() * 10)/100;
			return discount;
		}
		else if(bObj.getBeroType().equals("Wood Bero"))
		{
			discount=(bObj.getPrice() * 15)/100;
			return discount;
		}
		else
		{
			return 0;
		}
	}
}
