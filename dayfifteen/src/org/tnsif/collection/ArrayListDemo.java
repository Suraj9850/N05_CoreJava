//Generic or homogeneous ArrayList
package org.tnsif.collection;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> intList=new ArrayList<Integer>();
		intList.add(10);
		intList.add(39);
		intList.add(12);
		intList.add(95);
		intList.add(51);
		
		System.out.println(intList);
		//Insert element at specific position
		intList.add(2, 15);
		Collections.sort(intList);
		System.out.println("After sorting:"+intList);
		Collections.reverse(intList);
		System.out.println("After Reverse:"+intList);
		System.out.println("is 10 prsent "+intList.contains(10));
		System.out.println("is 100 prsent "+intList.contains(100));
		System.out.println(intList.remove(5));	
		System.out.println(intList.remove(intList.indexOf(51)));
		System.out.println(intList);
		System.out.println(intList.indexOf(12)>=0?"Present":"Not Present");
		
		//Iterator can moves only forward not backward
		Iterator<Integer> it=intList.iterator();
		while(it.hasNext())
		{
			int no=it.next();
			System.out.print(no*no+" ");
		}
	}

}
