//program to demonstrate to Ternary operator
package org.tnif.operator;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no:");
		int no=s.nextInt();
		String res=(no%2==0)?"Even":"Odd";
		System.out.println(res);
	}

}
