package com.basicsstrong.creational;

public class AbstractFactoryDesignPattern {

	public static void main(String[] args) {

		 DatabaseFactory factory = null;
		 Database db = null;
		 
		 factory = DatabaseFactory.createDatabaseFactory("RDBMS");
		 db = factory.getDatabase("MySql");
		 System.out.println(db.connect());
		 db = factory.getDatabase("Oracle");
		 System.out.println(db.connect());
		 
		 factory = DatabaseFactory.createDatabaseFactory("DBMS");
		 db = factory.getDatabase("MsAccess");
		 System.out.println(db.connect());
	}

}
