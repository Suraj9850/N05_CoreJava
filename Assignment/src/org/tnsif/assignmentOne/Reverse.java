package org.tnsif.assignmentOne;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of n:");
		int n=sc.nextInt();
		
		int mary[]= new int[n];
		int pinky[]= new int[n];
		System.out.println("Enter the mary elements:");
		for(int i=0;i<n;i++)
		{
			mary[i]=sc.nextInt();
		}
		System.out.println("Enter the pinky elements:");
		for(int i=0;i<n;i++)
		{
			pinky[i]=sc.nextInt();
		}
		
		int j=pinky.length-1;
		boolean check=true;
		
		for(int i=0;i<mary.length;i++,j--)
		{
			if(mary[i]!=pinky[j])
			{
				check=false;
			}
		}
		if(check)
		{
			System.out.println("Yes, it is in reverse order....");
		}
		else
		{
			System.out.println("No, it is not in reverse order....");
		}
	}

}
