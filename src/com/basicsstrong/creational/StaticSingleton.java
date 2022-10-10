package com.basicsstrong.creational;

public class StaticSingleton {

	private static StaticSingleton singleton;
	
	private StaticSingleton() {
	}
	
	
	static {
		try {
			
			singleton = new StaticSingleton();
			
		} catch (Exception E) {
			
			throw new RuntimeException("Exception occured while creating singleton nstance");
		}
	}
	
	public static StaticSingleton getInstance()
	{
		return singleton;
	}
}
