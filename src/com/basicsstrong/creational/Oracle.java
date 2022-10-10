package com.basicsstrong.creational;

public class Oracle implements Database {
	
	@Override
	public String connect() {
		return "Connection Successful with Oracle DB.";
		
	}

}
