package com.basicsstrong.behavioural;

public class Flipkart extends ProcessOrder {

	@Override
	public void selectProduct() {
		System.out.println("-----Online Shopping----- ");
		System.out.println("Search for the relative product");
		System.out.println("Add to cart");
		System.out.println("Checkout");
		
	}

	@Override
	public void makePayment() {
		System.out.println("Add address details.");
		System.out.println("Select the mode of payment");
		System.out.println("make payment");
	}

	@Override
	public void deliver() {
		System.out.println("Your product will be delivred in 3-4 days at given address details.");
		System.out.println("Continue Shopping");
		System.out.println("----------------------------------------");
		
	}
	
	

}
