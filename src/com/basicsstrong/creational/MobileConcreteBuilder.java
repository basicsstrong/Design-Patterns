package com.basicsstrong.creational;

public class MobileConcreteBuilder extends MobileBuilder{
	
	
	@Override
    public void createMemory() {
		getMobile().setMemory("32 GB");
		System.out.println("Memory created and installed");
	}
	
	@Override
	public void createBattery() {
		getMobile().setBattery("4500 mAh");
		System.out.println("Battery created and installed");
	}
	
	@Override
	public void createWireless() {
		getMobile().setWireless("Bluetooth and WiFi");
		System.out.println("Created wireless features and installed");
	}
	
	@Override
	public void createScreen() {
		getMobile().setScreen("Bluetooth and WiFi");
		System.out.println("Created wireless features and installed");
	}
	
	@Override
	public void createMetalCase() {
		getMobile().setMetalCase("Bluetooth and WiFi");
		System.out.println("Created wireless features and installed");
		
	}

}
