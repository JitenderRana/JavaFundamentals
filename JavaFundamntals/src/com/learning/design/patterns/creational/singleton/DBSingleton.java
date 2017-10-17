package com.learning.design.patterns.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSingleton {
	
	private static DBSingleton dbSingleton;
	private Connection conn;
	private void DBSingleton(){
		
	}
	public static DBSingleton getInstance()
	{
		//thread safe
		synchronized (DBSingleton.class) { 
			if(dbSingleton == null)  //lazy loading
			{
				System.out.println("creating new instance");
				return new DBSingleton();
			}
			else return dbSingleton;
		}
	}
	
	public Connection getConnection() throws SQLException, ClassNotFoundException
	{
		//thread safe
		synchronized (DBSingleton.class) { 
			if(conn == null)  //lazy loading
			{
				System.out.println("creating connection!!");
				Class.forName("com.mysql.jdbc.Driver");				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sanjay_test","root","root");  
				return con;
			}
			else return conn;
		}
	}
}
