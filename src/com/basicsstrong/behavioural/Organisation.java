package com.basicsstrong.behavioural;

import java.util.ArrayList;
import java.util.List;

public class Organisation {
	
	static List<Employeee> empList;
	
	static {
		empList = new ArrayList<Employeee>();
		
		Employeee bob = new Employeee("Bob");
		Employeee ronney = new Employeee("Ronney");
		Employeee alex = new Employeee("Alex");
		Employeee nick = new Employeee("Nick");
		Employeee joe = new Employeee("Joe");
		
		empList.add(bob);
		empList.add(ronney);
		empList.add(alex);
		empList.add(nick);
		empList.add(joe);
      }
	
	public static void ratings () {
		
		CEO ceo = new CEO("MR.George");
		for(Employeee e : empList) {
			 e.accept(ceo);
		}
	}

}

