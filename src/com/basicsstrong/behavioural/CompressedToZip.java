package com.basicsstrong.behavioural;

public class CompressedToZip implements Strategy {

	@Override
	public void compressFile(String Filename) {
		System.out.println(Filename+ " has been successfully converted to .zip file.");
		
	}
	
	

}
