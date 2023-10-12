package org.tnsif.mvc;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentServiceImpl implements IStudentService
{
	Connection con;
	Statement st;
	PreparedStatement pst;
	
	public StudentServiceImpl()throws Exception 
	{
		con=DButil.getCon();
		st=con.createStatement();
	}

	@Override
	public void addStudent(Student student)throws SQLException
	{
		pst=con.prepareStatement("INSERT INTO student VALUES(?,?,?)");
		pst.setInt(1, student.getRollNo());
		pst.setString(2, student.getName());
		pst.setFloat(3, student.getMarks());
		int n=pst.executeUpdate();
		pst.close();
		if(n==1)
			System.out.println("Record Inserted.......");
		else
			System.out.println("Record not inserted.......");
	}

	@Override
	public List<Student> getAllStudents()throws SQLException 
	{
		List<Student> studList=new ArrayList<Student>();
		ResultSet rs=st.executeQuery("SELECT * FROM student");
		while(rs.next())
		{
			Student st=new Student(rs.getInt(1), rs.getString(2), rs.getFloat(3));
			studList.add(st);
		}
		rs.close();
		return studList;
	}

	@Override
	public List<Student> getStudentByPer(float value)throws SQLException
	{
		List<Student> studList=new ArrayList<Student>();
		pst=con.prepareStatement("SELECT * FROM `student` WHERE marks>?");
		pst.setFloat(1, value);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			Student st=new Student(rs.getInt(1), rs.getString(2), rs.getFloat(3));
			studList.add(st);
		}
		rs.close();
		return studList;
	}

	@Override
	public List<Student> getStudentNameStartWith(String str)throws SQLException {
		List<Student> studList=new ArrayList<Student>();
		pst=con.prepareStatement("SELECT * FROM `student` WHERE sname LIKE ?");
		pst.setString(1, str);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			Student st=new Student(rs.getInt(1), rs.getString(2), rs.getFloat(3));
			studList.add(st);
		}
		rs.close();
		return studList;
	}

	@Override
	public int deleteAllStudents()throws SQLException{
		int no=st.executeUpdate("DELETE FROM student");
		return no;
	}

	@Override
	public int deleteByRollNo(int value)throws SQLException {
		int no=st.executeUpdate("DELETE FROM student where rollno="+value+"");
		return no;
	}

	@Override
	public int updateStudent(float per)throws SQLException {
		pst=con.prepareStatement("UPDATE student SET marks=marks+? WHERE marks<=?");
		pst.setFloat(1, per);
		pst.setFloat(2,100-per);
		int no=pst.executeUpdate();
		return no;
	}

	@Override
	public int updateStudentPerByRollNo(int roll,float per)throws SQLException {
		pst=con.prepareStatement("UPDATE student SET marks=marks+? WHERE marks<=? and rollno=?");
		pst.setFloat(1, per);
		pst.setFloat(2,100-per);
		pst.setInt(3, roll);
		int no=pst.executeUpdate();
		return no;
	}
	
	protected void finalize()throws Exception{
		con.close();
	}
	
	void display(List<Student> list)
	{
		Iterator<Student> it=list.iterator();
		System.out.println(list.isEmpty()?"No record":"Id\tName\tMarks\n----------------------");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
