package com.basicsstrong.behavioural;

public class Shop extends ProcessOrder {

	@Override
	public void selectProduct() {
		System.out.println("-----Offline Shopping-----");
		System.out.println("Go to the appropriate rack and choose the product...");
	}

	@Override
	public void makePayment() {
		System.out.println("Go to the cash counter");
		System.out.println("stand in a queue");
		System.out.println("make payment");
		System.out.println("Get the PAID stamped copy of bill ");
		
	}

	@Override
	public void deliver() {
		System.out.println("Show the copy of bill");
		System.out.println("get your product at delivery counter.");
		System.out.println("Thanks for visiting us");
		System.out.println("--------------------------------------------");
		
	}
	
	
	

}
