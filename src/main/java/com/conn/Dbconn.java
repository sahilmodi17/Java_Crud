package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconn {
	
	private static Connection conn=null;
	
	public static Connection getConnection()
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			
		}catch(Exception e) {
			
		}

		return conn;
	}
	

}