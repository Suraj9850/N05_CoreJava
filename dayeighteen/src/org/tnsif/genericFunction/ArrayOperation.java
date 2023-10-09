package org.tnsif.genericFunction;

import java.util.Arrays;

public class ArrayOperation {
	public static<E> void display(E values[])
	{
		for(E value:values)
		{
			System.out.print(value+" ");
		}
	}
	public static<E extends Number> void sortArray(E values[])
	{
		Arrays.sort(values);
		
	}
}
