//program to demonstrate on user input
package org.tnif.introduction;

import java.util.Scanner;

public class UserInputDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
		/*
			
			System.out.println("Enter the value of num:");
			int num=s.nextInt();
			System.out.println("The value of num is "+num);
			
			System.out.println("Enter the value of num:");
			float num1=s.nextFloat();
			System.out.println("The value of float num is "+num1);
			
			System.out.println("Enter the Character:");
			char c=s.next().charAt(0);
			System.out.println("The character  is "+c);
			*/
			System.out.println("Enter the String");
			String str=s.nextLine();
			System.out.println("The string  is "+str);
	}

}
