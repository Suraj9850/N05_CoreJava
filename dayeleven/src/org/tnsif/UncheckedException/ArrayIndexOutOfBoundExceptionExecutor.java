package org.tnsif.UncheckedException;
//program to demonstrate on arrayIndexOutOfBoundException
public class ArrayIndexOutOfBoundExceptionExecutor {
	static void print(int arr[])
	{
		try
		{
			System.out.println(arr[2]);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled:"+e);
		}
		finally {
			System.out.println("Finally block always executed");
		}
	}
	public static void main(String[] arg)
	{
		int arr[]= {1,2,3};
		print(arr);
	}
}
