package com.basicsstrong.creational;

public class Mobile {

	private String memory;
	private String battery;
	private String wireless;
	private String screen;
	private String metalCase;
	
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String Battery) {
		this.battery = Battery;
	}
	public String getWireless() {
		return wireless;
	}
	public void setWireless(String wireless) {
		this.wireless = wireless;
	}
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public String getMetalCase() {
		return metalCase;
	}
	public void setMetalCase(String metalCase) {
		this.metalCase = metalCase;
	}
	@Override 
	public String toString() {
		return "Mobile [memory=" + memory + ", battery=" + battery + ", wireless=" + wireless + ", screen=" + screen + ", metalCase=" + metalCase + "]"; 
	}

}		
		
		