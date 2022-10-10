package com.basicsstrong.behavioural;

import java.util.ArrayList;
import java.util.List;

class Refrigerator {
	
	private int price;
	private int volume;
	private boolean isPowerSaver;
	
	public Refrigerator(int price, int volume, boolean isPowerSaver) {
		super();
		this.price = price;
		this.volume = volume;
		this.isPowerSaver = isPowerSaver;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPowerSaver() {
		return isPowerSaver;
	}

	public void setPowerSaver(boolean isPowerSaver) {
		this.isPowerSaver = isPowerSaver;
	}

	@Override
	public String toString() {
		return "Refrigerator [price=" + price + ", volume=" + volume + ", isPowerSaver=" + isPowerSaver + "]";
	}

}

class Memento {
	
	Refrigerator refri;
	
	public Memento(Refrigerator refri) {
		this.refri = refri;
		}
	
	public Refrigerator getRefri() 
	{
		return refri;
	}
	
	public void setRefri(Refrigerator ref)
	{
		refri = ref;
	}
	@Override
	public String toString() {
		return "Memento [refri=" +refri + "]";
	}
	
	
}

class LivingAreaOriginator{
	
	Refrigerator ref;

	public Refrigerator getRef() {
		return ref;
	}

	public void setRef(Refrigerator ref) {
		this.ref = ref;
	}
	
	public Memento createMemento() {
		return new Memento(ref);
	}
	
	public void getMemento(Memento m) {
		ref = m.getRefri();
	}
	
	@Override
	public String toString() {
		return "LivingAreaOriginator[ref=" + ref +"]";
	}
}

class CareTakerStore{
	List<Memento> refLists = new  ArrayList<Memento>();
	
	public void  addMemento(Memento memento) {
		refLists.add(memento);
	}
	public Memento getMemento(int index) {
		return refLists.get(index);
		}
	
	
}



public class MementoDesignPattern {

	public static void main(String[] args) {

		LivingAreaOriginator originator = new  LivingAreaOriginator();
		
		CareTakerStore ct = new CareTakerStore();
		
		originator.setRef(new Refrigerator (15000, 15, false));
		
		ct.addMemento(originator.createMemento());
		
        originator.setRef(new Refrigerator (25000, 20, true));
		
		ct.addMemento(originator.createMemento());
		
		System.out.println("Current state of originator: "+originator);
		
		System.out.println("Restoring the old one");
		
		originator.getMemento(ct.getMemento(0));
		
		System.out.println("Current state, after restoring: "+originator);
		
	}

}
