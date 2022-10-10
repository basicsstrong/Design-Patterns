package com.basicsstrong.creational;

public class SyncSingleton {
	
private static SyncSingleton singleton;
	
	private SyncSingleton () {}
	
	public static synchronized SyncSingleton getInstance()
	
	{
		if(singleton == null)
		{
			return singleton  = new SyncSingleton();
		}
		return singleton;
	}
}
