package org.tnsif.genericClass;

public class GenericClassDemo {
	public static void main(String a[])
	{
		Repo<Integer> obj1=new Repo<Integer>();
		obj1.setData(10);
		System.out.println(obj1.getData());
		
		Repo<String> obj2=new Repo<String>();
		obj2.setData("Soham");
		System.out.println(obj2.getData());
		
		Repo<Student> s=new Repo<Student>();
		s.setData(new Student(1, 25, "Mohit"));
		System.out.println(s.getData());
	}
}
