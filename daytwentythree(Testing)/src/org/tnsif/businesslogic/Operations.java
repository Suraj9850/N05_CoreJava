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
}

