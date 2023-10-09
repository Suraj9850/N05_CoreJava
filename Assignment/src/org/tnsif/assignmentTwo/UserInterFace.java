package org.tnsif.assignmentTwo;

import java.util.Scanner;

public class UserInterFace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products p=new Products();
		Scanner sc=new Scanner(System.in);
		while(true)
		{	
			System.out.println("1.Add\n2.Display\n3.Exit\n");
			System.out.println("\nEnter your choice:");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:
					sc.nextLine();
					System.out.println("Enter the product:");
					String productName=sc.nextLine();
					p.addProductToList(productName);
				break;
			case 2:
					p.sortProductList();
					break;
			case 3:
					System.out.println("thank you");
					System.exit(0);
			default:
				break;
			}
		}
	}

}
