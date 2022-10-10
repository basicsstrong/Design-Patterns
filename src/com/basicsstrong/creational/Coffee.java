package com.basicsstrong.creational;

public class Coffee {
	
	int coffeeId;
	String coffeeName;
	public int getCoffeeId() {
		return coffeeId;
	}
	public void setCoffeeId(int coffeeId) {
		this.coffeeId = coffeeId;
	}
	public String getCoffeeName() {
		return coffeeName;
	}
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	
	@Override 
	public String toString() {
		return "Coffee [coffeeId=" + coffeeId + ", coffeeName=" + coffeeName + "]";
	}

}
