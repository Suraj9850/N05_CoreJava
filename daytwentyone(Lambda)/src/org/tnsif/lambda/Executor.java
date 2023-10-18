package org.tnsif.lambda;

import java.util.function.Supplier;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube c=(no)->no*no*no;
		System.out.println("Cube:"+c.getCube(5));
		
		Operation add=(a,b)->a+b;
		Operation sub=(a,b)->{return a-b;};
		Operation div=(a,b)->a/b;
		Operation mul=(a,b)-> a*b;
		System.out.println("Addition:"+add.performArithmaticoperation(10, 20));
		System.out.println("Subtraction:"+sub.performArithmaticoperation(10, 20));
		System.out.println("Multiplication:"+mul.performArithmaticoperation(10, 20));
		System.out.println("Division:"+div.performArithmaticoperation(10, 20));
	}

}
