package org.tnsif.collection;
import java.util.*;

//Program to demonstrate heterogeneous data in collection
public class Executor {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List listOne=new ArrayList();
		listOne.add(10);
		listOne.add(true);
		listOne.add(10.20);
		listOne.add("Hello");
		listOne.add(new String("E"));
	
		System.out.println(listOne);
		//cast exception
		Collections.sort(listOne);
		System.out.println(listOne);
	}

}
