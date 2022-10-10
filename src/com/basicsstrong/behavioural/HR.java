package com.basicsstrong.behavioural;

public class HR implements EmployeeState{

	@Override
	public void work() {
		System.out.println("Work : Recruitment resources for Organisation");
	}

	@Override
	public void canApproveLeave() {
		System.out.println("Can approve Leaves : No, HR can't approve the leave.!\n");
	}
	
	

}
