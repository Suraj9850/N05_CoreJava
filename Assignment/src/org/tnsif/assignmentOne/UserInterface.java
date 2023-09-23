package org.tnsif.assignmentOne;

import java.util.Scanner;

public class UserInterface {
//	Enter Customer Name
//	Barath
//	Enter Phone Number
//	9876543210
//	Enter address
//	North Street
//	Enter Bero Type
//	Wooden Bero
//	Enter Bero Colour
//	Brown
//	Enter Wood Type
//	Ply Wood
//	Amount needs to be paid 12750.00

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,address,beroType,beroColor,woodType;
		long phone;
		int beroHeight;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Customer Name:");
		name=sc.nextLine();
		System.out.println("Enter Phone Number:");
		phone=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter address:");
		address=sc.nextLine();
		
		System.out.println("Enter Bero Type:");
		beroType=sc.nextLine();
		
		CustomerDetails c=new CustomerDetails(name, phone, address);
		
		if(beroType.equals("Wood Bero"))
		{
			System.out.println("Enter Bero Colour:");
			beroColor=sc.nextLine();
			System.out.println("Enter Wood Type:");	
			woodType=sc.nextLine();
			
			Bero b=new WoodenBero(beroType, beroColor, woodType);
			b.calculatePrice();
			Discount d=new Discount();
			System.out.println("Amount needs to be paid: "+(b.getPrice()-d.calculateDiscount(b)));
		}
		else if(beroType.equals("Steel Bero"))
		{
			System.out.println("Enter Bero Colour:");
			beroColor=sc.nextLine();
			System.out.println("Enter Steel Height:");	
			beroHeight=sc.nextInt();
			
			Bero b=new SteelBero(beroType, beroColor, beroHeight);
			b.calculatePrice();
			Discount d=new Discount();
			System.out.println("Amount needs to be paid: "+(b.getPrice()-d.calculateDiscount(b)));
		}
		else
		{
			System.out.println(beroType+" is an invalid bero type");
		}
	}
}
