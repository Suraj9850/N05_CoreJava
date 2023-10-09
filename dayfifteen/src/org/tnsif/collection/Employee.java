package org.tnsif.collection;

import java.util.Comparator;

public class Employee implements Comparable<Employee>
{
	private int empId;
	private String empName;
	private float salary;
	private String designation;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, float salary, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.designation = designation;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", designation="
				+ designation + "]\n";
	}
	@Override
	public int compareTo(Employee o) {
		//sort according to salary 
//		return (int) (getSalary()-o.getSalary());
		
		//sort according to Name
		return (int) (getEmpName().compareTo(o.getEmpName()));
	}
}

class SortByName implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpName().compareTo(o2.getEmpName());
	}	
}
class SortByDesignation implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getDesignation().compareTo(o2.getDesignation());
	}	
}
