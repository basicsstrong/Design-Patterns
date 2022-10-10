package com.basicsstrong.creational;

public class DBMSDatabaseFactory extends DatabaseFactory {
	
	public Database getDatabase(String dbType) {
		Database dc = null;
		if ("MsAccess".equalsIgnoreCase(dbType))
			dc = new MsAccess();
		else if ("XML".equalsIgnoreCase(dbType ))
			dc = new XML();
		else if ("MongoDB".equalsIgnoreCase(dbType ))
			dc = new MongoDB();
		else
			dc = new XML();
		
		return dc;
		}
}



