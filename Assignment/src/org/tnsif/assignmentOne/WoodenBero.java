package org.tnsif.assignmentOne;

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
