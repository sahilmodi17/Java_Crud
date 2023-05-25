package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConn {
	
	private static Connection conn;
	
	public static Connection getConnection()
	{
		
		try {
			Class.forName(null);
			conn=DriverManager.getConnection(null);
			
		}catch(Exception e) {
			
		}

		return conn;
	}
	

}
