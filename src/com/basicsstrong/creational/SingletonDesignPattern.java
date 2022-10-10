package com.basicsstrong.creational;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingletonDesignPattern {

	public static void main(String[] args) throws Exception
	{
		
		EagerSingleton obj = EagerSingleton.getInstance();
		
		saveToFile(obj, "myFile.bin");
		
		obj.setVal(20);
		
		EagerSingleton obj2 = readFile("myFile.bin");
		
		System.out.println(obj.getVal());
		
		System.out.println(obj2.getVal());
		
		Constructor cons = obj.getClass().getDeclaredConstructor(new Class[0]);
		
		cons.setAccessible(true);
		
		EagerSingleton obj3 = (EagerSingleton) cons.newInstance();
		
		if(obj == obj3) {
			System.out.println("Both are same");
		}else
		System.out.println("Both are different");
		
		EnumSingleton eSing = EnumSingleton.SINGLETON;
		eSing.doStuff();

	}

	static void saveToFile(EagerSingleton singleton, String name) throws IOException{
		
		try(FileOutputStream fout = new FileOutputStream(name);
				ObjectOutputStream out = new ObjectOutputStream(fout)){
			
			out.writeObject(singleton);
			
		}
		
		
	}
	static EagerSingleton readFile(String file) throws ClassNotFoundException, IOException {
		try(FileInputStream in = new FileInputStream(file);
				ObjectInputStream oin = new ObjectInputStream(in)){
			return (EagerSingleton) oin.readObject();
		}
	}
	
	
	

}