package com.basicsstrong.structural;



interface ISpeakFrench{
	
	public void speak();
}

class FrenchPerson implements ISpeakFrench{

	@Override
	public void speak() {
		System.out.println("French French");
		
	}
	
}

interface ISpeakEnglish{
	
	public void speak();
}

class EnglishPerson implements ISpeakEnglish{

	@Override
	public void speak() {
		System.out.println("English English");
		
	}
	
}

class FrenchtoEnglishAdapter implements ISpeakEnglish{
	
	ISpeakFrench french;
	public FrenchtoEnglishAdapter(ISpeakFrench french){
		this.french=french;
	}

	@Override
	public void speak() {
		this.french.speak();
		// Most of the people miss this conversion step while explaning this pattern
		System.out.println("Converting into the Brain..");
		System.out.println("English English");
	}
}

public class AdaptorDemo {

	
	public static void main(String[] args) {
		
		FrenchtoEnglishAdapter translator=new FrenchtoEnglishAdapter(new FrenchPerson());
		
		translator.speak();
	}
}


