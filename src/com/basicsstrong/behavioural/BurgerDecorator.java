package com.basicsstrong.behavioural;

public abstract class BurgerDecorator extends PlainBurger{
	 protected Burger burger;
	 
	 public BurgerDecorator(Burger burger){
	 	this.burger = burger;
	 }
	 public String makeBurger(){
	 	return burger.makeBurger();
	 }

	}
