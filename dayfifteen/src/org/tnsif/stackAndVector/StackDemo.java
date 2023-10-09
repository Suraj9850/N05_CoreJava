package org.tnsif.stackAndVector;
import java.util.*;
public class StackDemo {
	//add first and last in feature of dequeue 
	public static void main(String[] args) {

		Stack<Integer> st=new Stack<Integer>();
		
		st.add(70);
		st.add(10);
		st.add(20);
		st.add(65);
		st.add(25);
		System.out.println(st);

		
		System.out.println("Stack size:"+st.size());
		System.out.println("Is Stack is empty:"+st.isEmpty());
		System.out.println("Remove element(Normally):"+st.pop());
		System.out.println("To check which no is peek:"+st.peek());
	
		System.out.println(st);
		
		while(!st.isEmpty())
		{
			System.out.println("Removed element:"+st.pop());
		}
	}

}
