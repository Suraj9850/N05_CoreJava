package org.tnsif.CustomException;

import java.util.Scanner;

import javax.security.auth.login.LoginException;

public class CustomExceptionExecutor {

	public static void main(String[] args) throws LoginCrediential 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter email and password:");
		String email=s.nextLine();
		String password=s.nextLine();
		try
		{
			if(email.equals("abc@gmail.com") && password.equals("Pass@123"))
			{
				System.out.println("Login");
			}
			else
			{
				throw new LoginCrediential("Invalid crediential");
			}
		}
		catch(LoginCrediential e)
		{
			System.out.println(e);
		}
	}

}
