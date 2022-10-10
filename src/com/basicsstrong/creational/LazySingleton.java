package com.basicsstrong.creational;

public class LazySingleton {
	
	private static LazySingleton singleton;
	
	private LazySingleton () {}
	
	public static synchronized LazySingleton getInstance()
	
	{
		if(singleton == null)
		{
			return singleton  = new LazySingleton();
		}
		return singleton;
	}

}
