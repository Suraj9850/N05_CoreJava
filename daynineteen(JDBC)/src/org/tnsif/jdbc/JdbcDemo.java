package org.tnsif.jdbc;
import java.sql.*;
public class JdbcDemo {
	public static void main(String a[])throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
		//RETRIVE
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM student");
		System.out.println("ID\tName\tMarks\n----------------------");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
		}
		rs.close();
		int no;
		//INSERT
		no=st.executeUpdate("INSERT INTO student VALUES(106,'Mohan',90.20)");
		if(no==1)
		{
			System.out.println("Record is inserted....");
		}
		else
		{
			System.out.println("Record not is inserted....");
		}
		//DELETE
		no=st.executeUpdate("DELETE FROM student WHERE sname LIKE 'M%'");
		if(no>=1)
		{
			System.out.println("Record is DELETED....");
		}
		else
		{
			System.out.println("Record not is DELETED....");
		}
		//UPDATE
		no=st.executeUpdate("UPDATE student SET marks=marks+5");
		if(no>=1)
		{
			System.out.println("Record is UPDATED....");
		}
		else
		{
			System.out.println("Record not is UPDATED....");
		}
		con.close();
	}
}