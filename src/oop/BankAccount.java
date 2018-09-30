package oop;

public class BankAccount implements IRate {

		String accountNumber; 
		private static final String routingNumber = "1234556"; 
		private String name; 
		private String ssn; 
		String accountType; 
		double balance; 
		
		
		BankAccount() {
			System.out.println("NEW ACCOUNT CREATED"); 
		}
		
		public String getSsn() {
			return ssn;
		}

		public void setSsn(String ssn) {
			this.ssn = ssn; //this refer to the variables of the class. 
		}

		BankAccount( String accountType) {
			System.out.println("NEW ACCOUNT" + accountType); 
		}
		
		BankAccount(String accountType, double initDeposit) {
			System.out.println("NEW ACCOUNT: " + accountType); 
			System.out.println("INITIAL DEPOSIT OF: " + initDeposit); 
		}
		
		//getters //setter
		//allow the user to define the name
		public void setName(String name) {
			this.name = name; 
		}
		
		public String getName () {
			return name; 
		}
		
		void deposit(double amount) {
			balance = balance + amount; 
			showActivity("DEPOSIT"); 
		}
		
		void withdraw(double amount) {
			balance = balance - amount; 
			showActivity("WITHDRAW"); 
			
		}
		//can only 
		private void showActivity(String activity) {
			System.out.println("YOUR RECENT TRANSACTION: " + activity); 
			System.out.println("YOUR NEW BALANCE IS: $" + balance);
			
		}
		void checkBalance() {
			
		}
		
		void getStatus() {
			
		}
		

		public String toString() {
			return "[" + "NAME:" + name + ". ACCOUNT#" + accountNumber + ". ROUTING #" + routingNumber + 
					". BALANCE: $" + balance + " ]"; 
		}
		
		
		public void setRate() {
			System.out.prinln("SET RATE"); 
		}
		
		public void  increase() {
			System.out.println("INCREASE RATE"); 
		}


}
