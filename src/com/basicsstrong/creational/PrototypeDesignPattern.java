package com.basicsstrong.creational;

public class PrototypeDesignPattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		CoffeeShop cs = new CoffeeShop();
		cs.setShopName("CCD");
		cs.loadStock();
		
		
		CoffeeShop cs1 = (CoffeeShop) cs.clone();
		cs1.setShopName("CCD London");
		

		cs.getCoffeeTypes().remove(0);
		System.out.println(cs1);
	}

}
