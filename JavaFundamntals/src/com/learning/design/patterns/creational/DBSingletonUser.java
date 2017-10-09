package com.learning.design.patterns.creational;

import java.sql.Timestamp;

public class DBSingletonUser {

	public static void main(String[] args) {
		
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
	}

}
