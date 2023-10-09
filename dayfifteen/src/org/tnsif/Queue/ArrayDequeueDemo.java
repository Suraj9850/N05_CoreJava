package org.tnsif.Queue;
import java.util.*;
public class ArrayDequeueDemo {
	//add first and last in feature of dequeue 
	public static void main(String[] args) {

		ArrayDeque<Integer> aqueue=new ArrayDeque<Integer>();
		
		aqueue.add(10);
		aqueue.add(50);
		aqueue.add(20);
		aqueue.add(65);
		aqueue.add(25);
		System.out.println(aqueue);
		
		aqueue.addFirst(61);
		aqueue.addLast(15);
		System.out.println(aqueue);
		
		System.out.println("Queue size:"+aqueue.size());
		System.out.println("Is queue is empty:"+aqueue.isEmpty());
		System.out.println("Remove element(Normally):"+aqueue.remove());
		System.out.println("To check which no is peek(Noramal peek):"+aqueue.peek());
		System.out.println("To check which no is peek(First element):"+aqueue.peekFirst());
		System.out.println("To check which no is peek(Last element):"+aqueue.peekLast());
		System.out.println("Remove element(First):"+aqueue.removeFirst());
		System.out.println("Remove element(Last):"+aqueue.removeLast());
		System.out.println(aqueue);
		
		while(!aqueue.isEmpty())
		{
			System.out.println("Removed element:"+aqueue.remove());
		}
	}

}
