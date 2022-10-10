package com.basicsstrong.behavioural;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorDesignPattern {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Tom");
		list.add("John");
		list.add("Rohn");
		list.add("Shiva");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Name :"+itr.next());
		}
		System.out.println("Concrete Iterator we get is: "+itr.toString());
		
		Set<String> set = new HashSet<>();
		set.add("SetTom");
		set.add("SetJohn");
		set.add("SetRohn");
		
		Iterator<String> setItr = set.iterator();
		System.out.println("Concrete Iterator we get is: "+setItr.toString());
		while(setItr.hasNext()) {
			System.out.println("Name :"+setItr.next());
		}
	}

}

