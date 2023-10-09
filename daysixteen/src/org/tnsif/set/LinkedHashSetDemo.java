package org.tnsif.set;

import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// Store data in-order which we store
		LinkedHashSet<String> cities=new LinkedHashSet<String>();
		cities.add("Nashik");
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Lucknow");
		cities.add("Nanded");
		System.out.println(cities);
		
		//sort linkedHashset element 
		List<String> list=new ArrayList<String>(cities);
		Collections.sort(list);
		System.out.println(list);
		cities=new LinkedHashSet<String>(list);
		System.out.println(cities);
	}

}
