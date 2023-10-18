package org.tnsif.client;

import java.sql.SQLException;
import java.util.*;

import org.tnsif.entity.Employee;
import org.tnsif.service.EmployeeServiceImpl;

public class Executor {

	public static void main(String[] args) throws SQLException {
		int empNo;
		String empName;
		float salary;
		Scanner sc=new Scanner(System.in);
		Employee emp;
		EmployeeServiceImpl serviceImpl=new EmployeeServiceImpl();
		List<Employee> empList;
		int ch;
		do
		{
			System.out.println("------------------EMPLOYEE------------------");
			System.out.println("1.Add Employee");
			System.out.println("2.Delete Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Retrive Employee");
			System.out.println("5.Exit");
			System.out.print("Enter yout choice:");
			ch=sc.nextInt();
			sc.nextLine();
			System.out.println("---------------------------------------------");
			switch (ch) {
			case 1:
					System.out.println("Enter Employee Details");
					System.out.print("Emp no:");
					empNo=sc.nextInt();
					sc.nextLine();
					System.out.print("Emp name:");
					empName=sc.nextLine();
					System.out.print("Emp salary:");
					salary=sc.nextFloat();
					emp=new Employee(empNo, empName, salary);
					int no=serviceImpl.addEmployee(emp);
					System.out.println(no==1?"\1 Employee added...":"Record not inserted...");
				break;
			case 2:
					System.out.print("Enter employee no:");
					empNo=sc.nextInt();
					sc.nextLine();
					no=serviceImpl.deleteEployeeByEmpno(empNo);
					System.out.println(no==1?"1 Employee deleted...":"Record not deleted...");
				break;	
			case 3:
				System.out.print("Enter employee no to modify a record:");
				empNo=sc.nextInt();
				sc.nextLine();
				System.out.print("Emp new employee name:");
				empName=sc.nextLine();
				System.out.print("Emp new employee salary:");
				salary=sc.nextFloat();
				emp=new Employee(empNo, empName, salary);
				no=serviceImpl.updateEmployeeByEmpno(empNo,emp);
				System.out.println(no==1?"1 Employee record updated...":"Record not updated...");
				break;
			case 4:
					System.out.println("--=--Employee Data-----");
					empList=serviceImpl.getAllEmployees();
					serviceImpl.display(empList);
				break;
			case 5:
				System.out.println("Thank you for use application.....");
				break;
			default:
					System.out.println("Invalid Choice...........");
				break;
			}
		}while(ch<5);
	}

}
