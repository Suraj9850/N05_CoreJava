//Program to define employee service interface for CRUD operation
package org.tnsif.service;
import java.sql.*;
import org.tnsif.entity.Employee;
import java.util.*;

public interface IEmployeeService {
	
	int addEmployee(Employee emp)throws SQLException;
	
	int deleteEployeeByEmpno(int empNo)throws SQLException;
	
	int updateEmployeeByEmpno(int empNo,Employee emp)throws SQLException;
	
	List<Employee> getAllEmployees()throws SQLException;
	
}
