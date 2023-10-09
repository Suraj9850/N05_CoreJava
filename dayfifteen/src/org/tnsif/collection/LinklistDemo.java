package org.tnsif.collection;

import java.util.*;

public class LinklistDemo {
	public static void main(String a[])
	{
		LinkedList<String> strList=new LinkedList<String>();
		//Add elements
		strList.add("Mohit");
		strList.add("Sumit");
		strList.add("Rupesh");
		strList.add("Yash");
		strList.add("Abhishek");
		
		System.out.println(strList);
		strList.addFirst("Soham");
		strList.addLast("Pruthvi");
		System.out.println(strList);
		System.out.println("First element:"+strList.getFirst());
		System.out.println("Last element:"+strList.getLast());
		
		System.out.println("Remove element:"+strList.remove());
		System.out.println("Remove element(By object):"+strList.remove("Abhishek"));
		System.out.println("Remove element(By index):"+strList.remove(2));
		
		Collections.sort(strList);
		System.out.println("After sort:"+strList);
		
		System.out.print("\nUsing List iterator(Forward)"
				+ ":");
		ListIterator<String> listIt=strList.listIterator();
		while(listIt.hasNext())
		{
			System.out.print(listIt.next().toUpperCase()+" ");
		}
		System.out.print("\nUsing List iterator(Reverse):");
		while(listIt.hasPrevious())
		{
			System.out.print(listIt.previous().toLowerCase()+" ");
		}
		
		//set position of iterator of last
		ListIterator<String> listIt1=strList.listIterator(strList.size());
		System.out.print("\nUsing List iterator(Reverse without go last index):");
		while(listIt1.hasPrevious())
		{
			System.out.print(listIt1.previous().toLowerCase()+" ");
		}
		
		
	}
}
