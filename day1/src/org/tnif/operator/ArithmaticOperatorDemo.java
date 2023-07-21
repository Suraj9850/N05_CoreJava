//Program for arithmatic operator
package org.tnif.operator;
import java.util.Scanner;

public class ArithmaticOperatorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 2 no:");
		int num1=s.nextInt();
		int num2=s.nextInt();
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		s.close();
	}

}
