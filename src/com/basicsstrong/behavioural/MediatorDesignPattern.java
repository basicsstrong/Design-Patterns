package com.basicsstrong.behavioural;

import java.util.ArrayList;
import java.util.List;

abstract class User{
	protected Mediator mediator;
	
	protected String name; 
	
	User(Mediator med, String name){
		this.mediator = med;
		this.name = name;
		
	}
	
	public abstract void send(String message);
	public abstract void receive(String message);
}

class UserIMPL extends User{
	
	UserIMPL(Mediator med, String name) {
		super (med, name);
	}

	@Override
	public void send(String message) {
		System.out.println(this.name+" : Sending message : "+message);
		mediator.sendMessage(message,this);
		
	}

	@Override
	public void receive(String message) {
		System.out.println(this.name+" : Received message : "+message);
		
	}
	
}


interface Mediator{
	public void sendMessage(String message, User user);
	public void registerUser(User user);
}

class MediatorImpl implements Mediator{
	
	private List<User> users;
	
	MediatorImpl(){
		this.users = new ArrayList<User>();
	}
	
	@Override
	public void sendMessage(String message, User user) {
		for(User u: this.users) {
			if(u != user) {
				u.receive(message);
			}
		}

	}

	@Override
	public void registerUser(User user) {
		this.users.add(user);
	}
	
	
}
public class MediatorDesignPattern {

	public static void main(String[] args) {
		
		Mediator med = new MediatorImpl();
		
		User shiva =  new UserIMPL(med, "Shiva");
		
		User vishnu =  new UserIMPL(med, "Vishnu");
		
		User jhon =  new UserIMPL(med, "Jhon");
		
		User rohn =  new UserIMPL(med, "Rohn");
		
		
		med.registerUser(shiva);
		med.registerUser(vishnu);
		med.registerUser(jhon);
		med.registerUser(rohn);
		
		shiva.send("Hello everybody!");
				

	}
	
}

