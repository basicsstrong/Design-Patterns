package com.basicsstrong.creational;
//Director
public class Manufracturer {
	
	
	public static Mobile createCompleteObject() 
	{
		
		MobileBuilder mobileBuilder = new MobileConcreteBuilder();
		
		return mobileBuilder.buildMobile();

}
}