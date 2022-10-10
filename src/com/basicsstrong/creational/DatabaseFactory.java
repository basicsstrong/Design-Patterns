package com.basicsstrong.creational;

public abstract class DatabaseFactory {
	
	public abstract Database getDatabase(String type);
	
	public static DatabaseFactory createDatabaseFactory(String factoryType) {
	if("RDBMS".equalsIgnoreCase(factoryType))
		return new RDBMSDatabaseFactory();
	else {
		return new DBMSDatabaseFactory();
	}
	}

}
