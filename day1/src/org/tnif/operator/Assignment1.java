package org.tnif.operator;
import java.util.Scanner;
public class Assignment1 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the age:");
		int age=s.nextInt();
		System.out.print("Enter the Weight:");
		int weight=s.nextInt();
		String res=(age>=18 && weight>=50)?"Eligible for donate blood":"Not eligible for donate blood";
		System.out.println(res);
		s.close();
	}
}
