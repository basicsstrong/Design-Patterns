package com.basicsstrong.structural;

public class BridgeDesignPattern {

	public static void main(String[] args) {
		
		Template art1= new ButterflyWallArt();
		Template art2= new TreeWallArt();
		
		Color blue = new Blue(); 
		Color red = new Red(); 
		
		
		art2.setColor(red);
		art2.designWall();
		
		

	}

}
