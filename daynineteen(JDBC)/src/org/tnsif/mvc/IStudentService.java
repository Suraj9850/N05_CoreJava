package org.tnsif.mvc;

import java.sql.SQLException;
import java.util.List;

public interface IStudentService {
	void addStudent(Student student)throws SQLException;
	
	List<Student> getAllStudents()throws SQLException;
	
	List<Student> getStudentByPer(float value)throws SQLException;
	
	List<Student> getStudentNameStartWith(String str)throws SQLException;
	
	int deleteAllStudents()throws SQLException;
	
	int deleteByRollNo(int value)throws SQLException;
	
	int updateStudent(float per)throws SQLException;
	
	int updateStudentPerByRollNo(int roll,float per)throws SQLException;
	
	
}
