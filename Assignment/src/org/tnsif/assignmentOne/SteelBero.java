package org.tnsif.assignmentOne;

//Calculating the Total Price	SteelBero
//	int beroHeight	Include the getter and setter method for all the attributes.
//Include a public parametrized constructor of three arguments in the following order - beroType, beroColour, beroHeight to intialize the values for the SteelBero object

//
//Calculating the Total Price	 
//SteelBero	 	 
//public void calculatePrice()	 
//This method should calculate the total price to be paid by the customer based on the beroHeight and setPrice of the bero
// 
//If the beroHeight is 3 feet, then the price should be Rs 5000
//If the beroHeight is 5 feet, then the price should be Rs 8000
//If the beroHeight is 7 feet, then the price should be Rs 10000
//Note: The attributes of the SteelBero class should be private and methods as public


public class SteelBero extends Bero
{
	private int beroHeight;
	public SteelBero(String beroType, String beroColour, int beroHeight) {
		super(beroType, beroColour);
		this.beroHeight = beroHeight;
	}
	
	public int getBeroHeight() {
		return beroHeight;
	}
	public void setBeroHeight(int beroHeight) {
		this.beroHeight = beroHeight;
	}
	
	@Override
	public void calculatePrice() {
		if(beroHeight == 3)
		{
			price=5000;
		}
		if(beroHeight == 5)
		{
			price=8000;
		}
		if(beroHeight == 7)
		{
			price=10000;
		}	
	}
	
}
