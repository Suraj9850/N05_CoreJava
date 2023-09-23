package org.tnsif.assignmentOne;

//Calculating the Total Price
//	WoodenBero
//	String woodType	Include the getter and setter method for all the attributes.
//Include a public parametrized constructor of three arguments in the following order - beroType, beroColour, woodType to intialize the values for the WoodenBero object


//Calculating the Total Price	 
//WoodenBero	 	 
//public void calculatePrice()	 
//This method should calculate the total price to be paid by the customer based on the woodType and the setPrice of the bero
//If the woodType is "Ply Wood" then the price should be Rs 15000
//If the woodType is "Teak Wood" then the price should be Rs 12000
//If the woodType is "Engineered Wood" then the price should be Rs 10000
//Note : woodType is case sensitive
//Note: The attributes of the WoodenClass class should be private and methods as public

public class WoodenBero extends Bero
{
	public WoodenBero(String beroType, String beroColour, String woodType) {
		super(beroType, beroColour);
		this.woodType = woodType;
	}

	private String woodType;

	public String getWoodType() {
		return woodType;
	}

	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}

	@Override
	public void calculatePrice() {
		if(woodType.equals("Ply Wood"))
		{
			price=15000;
		}
		if(woodType.equals("Teak Wood"))
		{
			price=12000;
		}
		if(woodType.equals("Engineered Wood"))
		{
			price=10000;
		}	
	}
}
