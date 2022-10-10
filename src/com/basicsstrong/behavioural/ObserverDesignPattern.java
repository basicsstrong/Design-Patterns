package com.basicsstrong.behavioural;

import java.util.ArrayList;
import java.util.Iterator;

public class ObserverDesignPattern {

	public static void main(String[] args) {
		Book book = new Book("Goosebumps", "Horror", "XYZ", 200, "SoldOut");
		EndUser user1 = new EndUser("Bob", book);
		EndUser user2 = new EndUser("Tom", book);
		ArrayList<Observer> subscribers = book.getObsList();
		for(Iterator<Observer> itr = subscribers.iterator(); itr.hasNext();) {
			EndUser eu = (EndUser) itr.next();
			System.out.println(eu +" has subscribed for "+ book.getName()+ "Book");
		}
		
		System.out.println(book.getInStock());
		
		
		System.out.println("Book is now available");
		
		book.setInStock("Back in stock");
		

	}

}
