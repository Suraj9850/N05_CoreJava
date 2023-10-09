package org.tnsif.genericFunction;

public class Executor {
	public static void main(String a[])
	{
		String name[]= {"Abc","Xyz","Pqr"};
		Integer no[]= {1,8,3,4,5,9,7};
		ArrayOperation.display(name);
		System.out.println();
		ArrayOperation.display(no);
		
		Student st[]=new Student[2];
		st[0]=new Student(1, 12, "Mohit");
		st[1]=new Student(2, 22, "Sumit");
		
		ArrayOperation.sortArray(no);
		System.out.println("\nSorted Array:");
		ArrayOperation.display(no);
		
		System.out.println();
		System.out.println("Student Array:");
		ArrayOperation.display(st);
	}
}
