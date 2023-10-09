package org.tnsif.Queue;
import java.util.*;
public class PriorityQueueDemo {
	//add first and last in feature of dequeue 
	public static void main(String[] args) {

		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		pq.add(70);
		pq.add(10);
		pq.add(20);
		pq.add(65);
		pq.add(25);
		System.out.println(pq);

		
		System.out.println("Priority Queue size:"+pq.size());
		System.out.println("Is Priority Queue is empty:"+pq.isEmpty());
		System.out.println("Remove element(Normally):"+pq.remove());
		System.out.println("To check which no is peek:"+pq.peek());
	
		System.out.println(pq);
		
		while(!pq.isEmpty())
		{
			System.out.println("Removed element:"+pq.remove());
		}
	}

}
