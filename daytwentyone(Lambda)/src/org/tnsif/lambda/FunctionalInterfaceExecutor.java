package org.tnsif.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceExecutor {

	public static void main(String[] args) {
		Supplier<String> mySupplier=()->"Hello";
		System.out.println(mySupplier.get());
		
		Consumer<Integer> cons;
		cons=(n)->{
			if(n>=0)
				System.out.println("Positive");
			else
				System.out.println("Negative");
		};
		cons.accept(-20);
		
		Predicate<Integer> pre=(no)->no%2==0;
		System.out.println(pre.test(19)?"Even no":"Odd no");
		
		Function<Integer, String> fun;
		fun=(no)->no>0?"Positive":"Negative";
		System.out.println(fun.apply(20));
		
		BiFunction<Integer, Integer, Integer> max;
		max=(a,b)->a>b?a:b;
		System.out.println("Maximum:"+max.apply(10, 20));
		
		BiFunction<String, String, String> com;
		com=(s1,s2)->s1.equals(s2)?"Equal":"Not equal";
		System.out.println(com.apply("Hello", "Hello"));
		System.out.println(com.apply("Hello", "Hello1"));
	}

}
