package com.basicsstrong.behavioural;

public class CompressedToRar implements Strategy {

	@Override
	public void compressFile(String Filename) {
     System.out.println(Filename+ " has been successfully converted to .rar file.");		
	}
	

}
