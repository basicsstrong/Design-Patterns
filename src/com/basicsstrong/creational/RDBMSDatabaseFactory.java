package com.basicsstrong.creational;

public class RDBMSDatabaseFactory extends DatabaseFactory {
	
	@Override
	public Database getDatabase(String dbType) {
		Database dc = null;
		if("Oracle".equalsIgnoreCase(dbType))
			dc = new Oracle();
		else if ("MySql".equalsIgnoreCase(dbType))
			dc = new MySql();
		else
			dc = new MySql();
		return dc;
	}

}
