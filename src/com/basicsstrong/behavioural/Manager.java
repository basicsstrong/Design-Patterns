package com.basicsstrong.behavioural;

public class Manager implements EmployeeState{

	@Override
	public void work() {
		System.out.println("Work : Design the project architecture for the organisation");
	}

	@Override
	public void canApproveLeave() {
		System.out.println("Can approve leaves : Yes, manager can approve leaves.\n");
	}
	

}
