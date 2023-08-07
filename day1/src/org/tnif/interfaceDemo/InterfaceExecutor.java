package org.tnif.interfaceDemo;

public class InterfaceExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we cant's initiate interface
		SbiDebitCard s=new SbiDebitCard();
		
		//Print is static method inside an interface to call print method we have to use interface name . method name()
		DebitCard.print();
		s.displayCardDetails();
		//we can call default method of an interface using obj 
		s.display();
		
		
		CheesePopCorn c=new CheesePopCorn();
		c.displayReceipe();
		
		Person p=new Person();
		p.showDrinkName();
	}

}
