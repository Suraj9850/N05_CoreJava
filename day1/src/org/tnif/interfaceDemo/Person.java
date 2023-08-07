package org.tnif.interfaceDemo;
//program to demonstrate for multiple inheritance
public class Person implements ColdDrink,Alcohol
{

	@Override
	public void showDrinkName() {
		System.out.println("Brand:"+brand+" "+"Alcohol name:"+alcohol+" "+"Drink name:"+name);
	}
	
}
