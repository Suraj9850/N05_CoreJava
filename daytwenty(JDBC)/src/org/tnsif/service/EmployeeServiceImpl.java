package org.tnsif.service;

import java.sql.*;
import java.util.*;

import org.tnsif.dao.DButil;
import org.tnsif.entity.Employee;

public class EmployeeServiceImpl implements IEmployeeService
{
	PreparedStatement pst;
	Connection con;
	public EmployeeServiceImpl()
	{
		con=DButil.getCon();
	}
	@Override
	public int addEmployee(Employee emp) throws SQLException {
		pst=con.prepareStatement("INSERT INTO employee VALUES(?,?,?)");
		pst.setInt(1, emp.getEmpNo());
		pst.setString(2, emp.getEmpName());
		pst.setFloat(3, emp.getSalary());
		return pst.executeUpdate();
	}

	@Override
	public int deleteEployeeByEmpno(int empNo) throws SQLException {
		pst=con.prepareStatement("DELETE FROM employee WHERE empno=?");
		pst.setInt(1, empNo);
		return pst.executeUpdate();
	}

	@Override
	public int updateEmployeeByEmpno(int empNo, Employee emp) throws SQLException {
		pst=con.prepareStatement("UPDATE employee SET empname=?,salary=? WHERE empno=?");
		pst.setString(1, emp.getEmpName());
		pst.setFloat(2, emp.getSalary());
		pst.setInt(3, empNo);
		return pst.executeUpdate();
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		List<Employee> empList=new ArrayList<Employee>();
		pst=con.prepareStatement("SELECT * FROM employee");
		ResultSet rs=pst.executeQuery();
		System.out.println("EmpNo\tName\tSalary\n----------------------");
		while(rs.next())
		{
			int empNo=rs.getInt(1);
			String empname=rs.getString(2);
			float salary=rs.getFloat(3);
			Employee emp=new Employee(empNo, empname, salary);
			empList.add(emp);
		}
		return empList;
	}
	public void display(List<Employee> empList)
	{
		Iterator<Employee> it=empList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
