package com.basicsstrong.behavioural;

public class CEO implements Visitor {
	
	private String  ceoName;
	
	public CEO(String ceoName) {
		this.ceoName = ceoName;
		}
	
	public String getCeoName() {
		return ceoName;
	}

	@Override
	public void visit(Visitable vis) {
		
		Employeee emp = (Employeee)vis;
		
		emp.setPerformanceStatus("Good");
		
		System.out.println("This is to certify that"
				+ emp.getName()+" performed " +emp.getPerformanceStatus()+
				" in his quater year. This rating has been given by our CEO "
				+this.getCeoName()+". Thank you All the best for future. ");
				
			
		
		
	}
	
	

}
