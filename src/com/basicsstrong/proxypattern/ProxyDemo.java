package com.basicsstrong.proxypattern;

public class ProxyDemo {

	public static void main(String[] args) {
		ProxyImage proxy=new ProxyImage();
		proxy.displayImage();
		ProxyImageCache proxycache = new ProxyImageCache();
		proxycache.displayImage();
	}
	
}


interface Image{
	public void displayImage();
}

class ActualImage implements Image{

	@Override
	public void displayImage() {
		System.out.println("This is real Image..");
		
	}
	
}

class ProxyImage implements Image{

	ActualImage realImage;
	
	
	@Override
	public void displayImage() {
		System.out.println("Cheking the access rights...");
		System.out.println("Eveything is good");
		ActualImage image=new ActualImage();
		image.displayImage();
		
	}
	
}

class ProxyImageCache implements Image{

	ActualImage realImage;
	
	
	@Override
	public void displayImage() {
		// Check if object is there in cache .. else fetch the new object and send
		System.out.println("Object is not there in cache..");
		ActualImage image=new ActualImage();
		image.displayImage();
		
	}
	
}

