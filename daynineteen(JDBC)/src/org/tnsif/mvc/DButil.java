package org.tnsif.mvc;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Properties;

import com.mysql.jdbc.*;

public class DButil {
	static Connection con;
	static 
	{	
		Properties prop=new Properties();
		try 
		{
			prop.load(new FileInputStream("src/DB.properties"));
			Class.forName(prop.getProperty("driver_name"));
//			driver_name=com.mysql.jdbc.Driver
//					db_url=jdbc:mysql://localhost:3306/jdbc
//					username=root
//					password=""
			con=(Connection) DriverManager.getConnection(prop.getProperty("db_url"),prop.getProperty("username"),prop.getProperty("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public static Connection getCon()
	{
		return con;
	}
}
