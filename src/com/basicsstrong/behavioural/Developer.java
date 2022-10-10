package com.basicsstrong.behavioural;

public class Developer implements EmployeeState {

	@Override
	public void work() {
		System.out.println("Work : Have to Complete the task assigned by senior management.");
	}
	
	@Override
	public void canApproveLeave() {
		System.out.println("can Approve leaves : Yes Developer can approve the leaves of traniee!\n.");
	}

}
