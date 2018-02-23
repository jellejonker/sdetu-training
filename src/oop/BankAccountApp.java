package oop;

public class BankAccountApp {
	
	public static void main(String[] args) {
		//Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Roger Hue";
		//With encapsulation: public API methods
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("123654");
		System.out.println("SSN: " + acc1.getSsn());
		
		acc1.accountNumber = "123456";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);

		//Polymorphism through overriding
		System.out.println(acc1.toString());
		
		
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking account");
		acc2.accountNumber = "123456";
		
		BankAccount acc3 = new BankAccount("Savings account", 5000);
		acc3.accountNumber = "123456";
		
		
		/*
		acc3.checkBalance();
		
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		*/
	}

}