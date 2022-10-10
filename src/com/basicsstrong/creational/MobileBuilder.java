package com.basicsstrong.creational;

public abstract class MobileBuilder {
	
	Mobile mobile;
	
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	public Mobile getMobile() {
		return mobile;
	}
	
	public abstract void createMemory();
	
	public abstract void createBattery();
	
	public abstract void createWireless();
	
	public abstract void createScreen();
	
	public abstract void createMetalCase();
	
	
	public final Mobile buildMobile() {
		
		Mobile  mob = new Mobile();
		
		setMobile(mob);
		
		createMemory();
		createBattery();
		createWireless();
		createScreen();
		createMetalCase();
		
		return mob;
		

	}

}
