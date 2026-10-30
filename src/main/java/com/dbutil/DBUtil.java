package com.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
	public static Connection establishConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbsep01","root","Sandeep@2003");
		return con;
	}

}
