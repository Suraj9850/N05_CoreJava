package org.tnsif.set;
import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		//Store only unique elements
		//this un-order unsorted set
		HashSet<String> courses=new HashSet<String>();
		courses.add("Enginnering");
		courses.add("MBA");
		courses.add("MCA");
		courses.add("Pharmacy");
		courses.add("Enginnering");
		
		System.out.println(courses);
		System.out.println(courses.size());
		
		Iterator<String> it=courses.iterator();
		System.out.print("Using iterator:");
		while(it.hasNext())
		{
			System.out.print(it.next().toUpperCase()+" ");
		}
		
		System.out.println(courses.remove("MBA")?"\nElement removed":"\nNot removed");
		System.out.println(courses);
		
		//Integer set  and perform set operation
		HashSet<Integer> hsOne=new HashSet<Integer>();
		hsOne.add(10);
		hsOne.add(35);
		hsOne.add(15);
		hsOne.add(45);
		hsOne.add(8);
		
		HashSet<Integer> hsTwo=new HashSet<Integer>();
		hsTwo.add(10);
		hsTwo.add(45);
		hsTwo.add(65);
		hsTwo.add(68);
		hsTwo.add(12);
		
		System.out.println("1st set:"+hsOne);
		System.out.println("2nd set:"+hsTwo);
		//Union of set
		hsOne.addAll(hsTwo);
		System.out.println("After add 2nd set into 1st:"+hsOne);
		
		hsOne.clear();
		hsOne.add(10);
		hsOne.add(35);
		hsOne.add(15);
		hsOne.add(45);
		hsOne.add(8);
		
		
		System.out.println("1st set:"+hsOne);
		System.out.println("2nd set:"+hsTwo);
		//Set Difference a-b
		hsOne.removeAll(hsTwo);
		System.out.println("After romveAll function");
		System.out.println("1st set:"+hsOne);
		System.out.println("2nd set:"+hsTwo);
		hsOne.clear();
		
		hsOne.clear();
		hsOne.add(10);
		hsOne.add(35);
		hsOne.add(15);
		hsOne.add(45);
		hsOne.add(8);
		
		//Intersection
		hsOne.retainAll(hsTwo);
		System.out.println("After intersection function");
		System.out.println("1st set:"+hsOne);
		System.out.println("2nd set:"+hsTwo);
		
		//For sorting convert in list then sort it
		List<Integer> list=new ArrayList<Integer>(hsTwo);
		Collections.sort(list);
		System.out.println(list);

	}

}
