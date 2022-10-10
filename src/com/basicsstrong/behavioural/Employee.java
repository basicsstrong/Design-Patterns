package com.basicsstrong.behavioural;

public class Employee {

	private String designation;
	private EmployeeState employeeState;
	
	public Employee(String designation) {
		setDesignation(designation);
	}
	
	public void working() {
		employeeState.work();
		}
	
	public void authorities() {
		employeeState.canApproveLeave();
		}
	
	public void setDesignation(String designation) {
		this.designation = designation;
		if (designation.equals("HR"))
			employeeState = new HR();
		else if (designation.equals("Developer"))
			employeeState = new Developer();
		else if (designation.equals("Manager"))
			employeeState = new Manager();
		else 
			employeeState = new Developer();
			
		}
			
}
