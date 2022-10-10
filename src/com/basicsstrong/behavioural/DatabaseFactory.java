package com.basicsstrong.behavioural;

public class DatabaseFactory {
	
	public static Database getDatabase(String DbTyp) {
		Database dc = null;
		if("RDBMS".equalsIgnoreCase(DbTyp))
			dc = new RDBMS();
		else
			dc = new DBMS();
		return dc;
	}

}
