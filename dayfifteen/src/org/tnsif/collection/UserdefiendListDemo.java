package org.tnsif.collection;

import java.util.*;

public class UserdefiendListDemo {
	public static void main(String a[])
	{
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(101,"Anuj",50000,"Sales"));
		empList.add(new Employee(102,"Sumit",30000,"HR"));
		empList.add(new Employee(103,"Sanket",40000,"Purchase"));
		
		Collections.sort(empList);
		System.out.println(empList);
		
		Collections.sort(empList,new SortByDesignation());
		System.out.println(empList);
		
		
		Comparator<Employee> compOne=(e1,e2)->
		{
			return (int) (e1.getSalary()-e2.getSalary());
		};
		Collections.sort(empList,compOne);
		System.out.println("By Salary"+empList);
	}
}
