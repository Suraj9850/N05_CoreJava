package org.tnsif.classPerTable;
import javax.persistence.Entity;

@Entity
public class Car extends Vehicle{
	private float average;
	private String fuelType;
	private float price;

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [average=" + average + ", fuelType=" + fuelType + ", price=" + price + "]";
	}

}