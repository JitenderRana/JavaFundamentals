package com.learning.design.patterns.creational.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

public class DBSingletonUser {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		
		System.out.println(new Timestamp(System.currentTimeMillis()));
		DBSingleton dbSingleton =DBSingleton.getInstance();		
		System.out.println(dbSingleton);
		System.out.println(new Timestamp(System.currentTimeMillis()));		
		
		DBSingleton dbSingleton2 =DBSingleton.getInstance();
		System.out.println(dbSingleton2);
		System.out.println(new Timestamp(System.currentTimeMillis()));
		
		DBSingleton dbSingleton3 =DBSingleton.getInstance();
		System.out.println(dbSingleton3);
		System.out.println(new Timestamp(System.currentTimeMillis()));
		
		System.out.println(new Timestamp(System.currentTimeMillis()));
		Connection con = dbSingleton.getConnection();
		System.out.println(new Timestamp(System.currentTimeMillis()));
		
		System.out.println(new Timestamp(System.currentTimeMillis()));
		Connection con1 = dbSingleton.getConnection();
		System.out.println(new Timestamp(System.currentTimeMillis()));
		
		System.out.println(new Timestamp(System.currentTimeMillis()));
		Connection con2 = dbSingleton.getConnection();
		System.out.println(new Timestamp(System.currentTimeMillis()));
		
		Thread.sleep(10000L);
		
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from emp");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
		//con.close();  
	}

}
