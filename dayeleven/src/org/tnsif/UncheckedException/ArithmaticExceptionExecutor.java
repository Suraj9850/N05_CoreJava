package org.tnsif.UncheckedException;

import java.util.Scanner;
//program to demonstrate on arithmetic exception
public class ArithmaticExceptionExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		//try block contains exceptional code 
		try
		{
			System.out.println(x/y);
		}
		catch(Exception e)
		{
			System.out.println("Exception message:"+e);
		}
		//catch block is used to handle the exception
		
	}

}
