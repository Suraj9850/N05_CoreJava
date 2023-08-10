package org.tnsif.SingleDimensionArray;

public class AssignmentOne {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int res[]=new int[4];
		int mul=1;
		for(int i=0;i<arr.length;i++)
		{	
			mul=1;
			for(int j=0;j<arr.length;j++)
			{
				if(j==i)
				{
					continue;
				}
				mul=mul*arr[j];
			}
			res[i]=mul;
		}
		System.out.print("Orignal array:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.print("\nResult	   :");
		for(int i:res)
		{
			System.out.print(i+" ");
		}
	}

}
