package com.basicsstrong.behavioural;

class Loan {

	private int amount;

	public Loan(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

}

abstract class LoanApproval {
	protected LoanApproval nextLoanApproval;

	public void setNextLoanApproval(LoanApproval nextLoanApproval) {
		this.nextLoanApproval = nextLoanApproval;
	}
	public abstract void approveLoan(Loan loan);

}


class Managerr extends LoanApproval {
	public void approveLoan(Loan loan) {
		if (loan.getAmount() <= 100000) {
			System.out.println("Approved by manager.");
		} else {
			nextLoanApproval.approveLoan(loan);
		}
	}
}

class Director extends LoanApproval {
	public void approveLoan(Loan loan) {
		if (loan.getAmount() <= 250000) {
			System.out.println("Approved by Director.");
		} else {
			nextLoanApproval.approveLoan(loan);
		}
	}
}

class VicePresident extends LoanApproval {
	public void approveLoan(Loan loan) {
		System.out.println("Approved by VP");
	}
}

public class ChainOfResponsibility {

	public static void main(String[] args) {
		LoanApproval m = new Managerr();
		LoanApproval d = new Director();
		LoanApproval vp = new VicePresident();
		
		m.setNextLoanApproval(d);
		d.setNextLoanApproval(vp);
		
		m.approveLoan(new Loan(500000));
	}

}
