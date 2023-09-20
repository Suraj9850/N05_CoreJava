package org.tnsif.CustomException;

public class MyException extends Exception
{
	private static int accno[]= {101,102,103,104};
	private static String name[]= {"yash","mahesh","sumit","mohit"};
	private static double bal[]= {1000.00,12000.32,2348.12,600.22};
	MyException()
	{
		
	}
	MyException(String str)
	{
		super(str);
	}
	public static void main(String a[])
	{
		try
		{
			System.out.println("Accno"+"\t"+"Name"+"\t"+"bal");
			for(int i=0;i<4;i++)
			{
				System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
				if(bal[i]<1000)
				{
					MyException e=new MyException("Balance is less than 1000 for Account no"+accno[i]);
					throw e;
				}
			}
			
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}
	}
}
