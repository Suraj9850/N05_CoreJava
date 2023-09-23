package org.tnsif.assignmentOne;
//Bero	String beroType
//String beroColour
//double price	Include the getter and setter method for all the attributes.
//Include a parametrized constructor of two arguments in the following order - beroType, beroColourto intialize the values for the Bero object	
//Bero	 	public abstract void calculatePrice()	 
//Note:The attributes of the Bero class should be protected and the methods should be public

public abstract class Bero {
	
	 protected String beroType;
	 protected String beroColour;
	 protected double price;
	 
	 public abstract void calculatePrice();
	 
	 public Bero(String beroType, String beroColour) {
			super();
			this.beroType = beroType;
			this.beroColour = beroColour;
		}
	 
	public String getBeroType() {
		return beroType;
	}
	public void setBeroType(String beroType) {
		this.beroType = beroType;
	}
	public String getBeroColour() {
		return beroColour;
	}
	public void setBeroColour(String beroColour) {
		this.beroColour = beroColour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	 
	 
}
