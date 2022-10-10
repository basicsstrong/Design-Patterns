package com.basicsstrong.behavioural;

public class Client {

	public static void main(String[] args) {
		PlainBurger plainBurger = new PlainBurger();
		System.out.println(plainBurger.makeBurger());
		   
		System.out.println(new BaconCheeseBurgerDecorator(plainBurger).makeBurger());
		 
		System.out.println(new BarbecueBurgerDecorator(plainBurger).makeBurger());
		 
	}

}
