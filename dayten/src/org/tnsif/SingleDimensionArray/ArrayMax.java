package org.tnsif.SingleDimensionArray;


import java.util.Arrays;
import java.util.Scanner;

//program to demonstrate on run time array and find out largest element in array
public class ArrayMax {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of element in array");
		int n=s.nextInt();
		//array declaration
		int arr[]=new int[n];
		//array initialization
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.print("Array elements:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		int max=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("\nLargest element in an array is:"+max);
		//array is an class an sort is the built in method 
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
