package org.tnsif.MultiDimensionArray;

import java.util.Scanner;

public class JaggedArrayDemo {

	public static void main(String[] args) 
	{
		//in jagged array outside array size if fixed but inside array size is different 
		//Jagged array declaration
		int arr[][]=new int[2][];
		//For outside array index 0 storing 3 elements 
		arr[0]=new int[3];
		//For outside array index 1 storing 2 elements 
		arr[1]=new int[2];
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Array elements:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
