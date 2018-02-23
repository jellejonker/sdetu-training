package oop;

public class BankAccount implements iRate {
	//Define variables
	String accountNumber;
	
	//static >> belongs to the CLASS not the object instance
	//final >> constant (often static final)
	private static final String routingNumber = "321654";
	
	//Instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance;

	//Constructor definitions: unique methods
		//1. They are used to define / setup / initialize properties of an object
		//2. Constructors are IMPLICITLY called upon instantiation
		//3. The same name as the class itself
		//4. Constructors have NO return type
	BankAccount() {
		System.out.println("New account created");
	}
	//Overloading: call same method with different arguments
	BankAccount(String accountType) {
		System.out.println("New account: " + accountType);
	}
	
	BankAccount (String accountType, double initDeposit) {
		//initDeposit, accountType, msg are all local variables
		System.out.println("New account: " + accountType);
		System.out.println("Initial deposit of: $ " + initDeposit);
		String msg = null;
		if (initDeposit < 1000) {
			msg = "Error:  minimum deposit must be at least $1.000";
		} else {
			msg = "Thanks for your initial deposit of: $ " + initDeposit;
		}
		System.out.println(msg);
		balance = initDeposit;
	}
	
	
	//Getters // Setters
	
	//Allow user to define name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//Interface methods
	public void setRate() {
		System.out.println("Setting rate");
	}
	public void increaseRate() {
		System.out.println("Increasing reate");
	}
	
	
	
	//Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("Withdraw");
	}
	
	//Private: can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("Your new balance is: " + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance = " + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ", ACCOUNT# " + accountNumber + ", ROUTING# " + routingNumber + ", Balance: $" + balance + " ]";
	}
}
