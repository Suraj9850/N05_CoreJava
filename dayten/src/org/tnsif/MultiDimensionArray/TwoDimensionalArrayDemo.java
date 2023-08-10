package org.tnsif.MultiDimensionArray;

import java.util.Scanner;
//program for 2d array
public class TwoDimensionalArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][2];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements:");
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 2; j++) 
			{
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("Array Elements:");
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 2; j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
