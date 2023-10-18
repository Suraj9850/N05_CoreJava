package org.tnsif.dao;
import java.sql.*;
import java.util.*;
import java.io.*;

public class DButil {
	static Connection con;
	static 
	{	
		Properties prop=new Properties();
		try 
		{
			prop.load(new FileInputStream("src/DB.properties"));
			Class.forName(prop.getProperty("driver_name"));
			con=(Connection) DriverManager.getConnection(prop.getProperty("db_url"),prop.getProperty("username"),prop.getProperty("password"));
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public static Connection getCon()
	{
		return con;
	}
}
