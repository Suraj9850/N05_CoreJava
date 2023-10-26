package org.tnsif.businesslogic;

public class Operations {
	static public long getFactorial(int no)
	{
		long fact=1;
		if(no>=0)
		{
			for(int i=1;i<=no;i++)
				fact*=i;
			return fact;
		}
		else
			return -1;
	}
	public static boolean isPrime(int no)
	{
		boolean flag=true;
		for(int i=2;i<=no/2;i++)
		{
			if(no%i==0)
				return false;
		}
		return flag;
	}
	public static boolean isStringPalindrome(String s)
	{
		if(s.equals(new StringBuffer(s).reverse().toString()))
		{
			return true;
		}
		return false;
	}
	public static boolean isNumberPalindrome(int no)
	{
		int rev=0;
		int temp=no;
		while(no!=0)
		{
			rev=rev*10+(no%10);
			no/=10;
		}
		if(rev==temp)
			return true;
		else
			return false;
	}
	public static String getName()
	{
		return "Manoj";
	}
	public static void performDivision(int a,int b)throws ArithmeticException
	{
		System.out.println("Division:"+a/b);
		
	}
	public static int add(int a,int b)
	{
		return a+b;
		
	}
}

