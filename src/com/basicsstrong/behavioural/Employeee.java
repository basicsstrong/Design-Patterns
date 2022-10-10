package com.basicsstrong.behavioural;

class Employeee implements Visitable{
	private String name;
	private String performanceStatus;
	
	public Employeee(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPerformanceStatus() {
		return performanceStatus;
	}
	public void setPerformanceStatus(String performanceStatus) {
		this.performanceStatus = performanceStatus;
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	
}

