package org.tnsif.CustomException;
//program to demonstrate on use defined exception
public class LoginCrediential extends Exception
{
	//private data member
	private String email;

	public LoginCrediential(String email) {
		super();
		this.email = email;
	}

	@Override
	public String toString() {
		return "LoginCrediential [email=" + email + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
