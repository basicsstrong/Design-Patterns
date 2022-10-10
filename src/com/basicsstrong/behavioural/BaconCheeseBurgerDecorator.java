package com.basicsstrong.behavioural;

public class BaconCheeseBurgerDecorator extends BurgerDecorator{

	public BaconCheeseBurgerDecorator(Burger burger) {
		super(burger);
	}
	public String makeBurger(){
	 	return burger.makeBurger() + ", bacon and cheese added.";
	 }
	}


