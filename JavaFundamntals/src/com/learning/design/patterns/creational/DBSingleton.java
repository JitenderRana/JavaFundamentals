package com.learning.design.patterns.creational;

public class DBSingleton {
	
	private static DBSingleton dbSingleton;
	private void DBSingleton(){}
	public static DBSingleton getInstance()
	{
		//thread safe
		synchronized (DBSingleton.class) { 
			if(dbSingleton == null)  //lazy loading
			return new DBSingleton();
			else return dbSingleton;
		}
	}
}
