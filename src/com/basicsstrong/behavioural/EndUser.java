package com.basicsstrong.behavioural;

public class EndUser implements Observer {
	
	String name;
	
	EndUser(String name, Book book) {
		this.name = name;
		book.subscribeObserver(this);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public EndUser(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(String avail) {
		System.out.println("Hello "+ name +"! we are glad to notify you that your book is now"+ avail);
	}

	
	
	
	
}
