package oop;

public class CDAccount extends BankAccount implements iRate {
	String interestRate;
	
	void compount() {
		System.out.println("Compounding interest");
	}

}
