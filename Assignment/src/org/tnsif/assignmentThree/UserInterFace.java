package org.tnsif.assignmentThree;

import java.util.Scanner;

public class UserInterFace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country c=new Country();
		Scanner sc=new Scanner(System.in);
		while(true)
		{	
			System.out.println("1.Add\n2.Search\n3.Exit\n");
			System.out.println("\nEnter your choice:");
			int ch=sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
					System.out.println("Enter the country:");
					String country=sc.nextLine();
					System.out.println("Enter the capital:");
					String capital=sc.nextLine();
					c.add(country, capital);
				break;
			case 2:
					System.out.println("Enter the country name");
					country=sc.nextLine();
					System.out.println("Capital:"+c.search(country));
					break;
			case 3:
					System.out.println("thank you");
					System.exit(0);
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}

}
