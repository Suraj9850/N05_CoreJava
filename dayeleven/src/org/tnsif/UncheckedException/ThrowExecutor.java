package org.tnsif.UncheckedException;

import java.io.IOException;
//program to demonstrate throw and throws keyword
public class ThrowExecutor {
	//throws keyword is used to declare an exception
	static void isElegible(int age,int weigth) throws IOException
	{
		if(age>=18 && weigth>50)
		{
			System.out.println("Eligible for donate blood.");
		}
		else
		{
			//throw keyword is use throw exception explicitly
			throw new IOException("Age and weigth criteria is not fulfill");
		}
	}
	void isEligible()
	{}
	 public static void main(String[] args) throws IOException 
	{
		isElegible(19, 52);
	}

}
