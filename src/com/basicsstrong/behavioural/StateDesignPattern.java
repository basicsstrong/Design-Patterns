package com.basicsstrong.behavioural;

public class StateDesignPattern {

	public static void main(String[] args) {

		
		Employee emp = new Employee("HR");
		emp.working();
		Employee emp1 = new Employee("Manager");
		emp1.working();
		emp1.authorities();
		
		
	}

}
