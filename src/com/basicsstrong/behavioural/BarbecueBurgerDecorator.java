package com.basicsstrong.behavioural;

public class BarbecueBurgerDecorator extends BurgerDecorator{
	 
public BarbecueBurgerDecorator(Burger burger){
 	super(burger);
 }
 public String makeBurger(){
 	return burger.makeBurger() + ", vegetables and cheese added.";
 }
}
