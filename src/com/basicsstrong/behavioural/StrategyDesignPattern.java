package com.basicsstrong.behavioural;

public class StrategyDesignPattern {

	public static void main(String[] args) {
		
		Context con = new Context();
		con.setCompressionStrategy(new CompressedToRar());
		con.generateFile("Abc.text");

	}

}
