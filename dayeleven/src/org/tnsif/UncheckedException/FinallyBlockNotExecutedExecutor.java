package org.tnsif.UncheckedException;

import java.util.Scanner;

public class FinallyBlockNotExecutedExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		try
		{
			System.out.println(x/y);
			//when we use System.exit(0) then finally block does not executed
//			System.exit(0);
		}
//		catch(NumberFormatException  | ArithmeticException e )
		catch(NumberFormatException e)
		{
			System.out.println("Exception message:"+e);
//			System.exit(0);
		}
		finally 
		{
			//when finally block contain an exception then finally block does not executed
//			System.out.println(4/0);
			System.out.println("Finally block always executed.");
		}
	}

}
