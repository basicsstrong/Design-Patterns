package com.basicsstrong.creational;

import java.io.Serializable;

public class EagerSingleton implements Serializable {
	
	 private static final EagerSingleton  singleton = new EagerSingleton();
	 
	 public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	private int val;
	 
	 private EagerSingleton() {
		 System.out.println("singleton created");
		 val = 10;
	 }
	 
	 public static EagerSingleton getInstance() {
		 return singleton;
	 }
	 
	 protected Object readResolve() {
		 return singleton;
	 }

}
