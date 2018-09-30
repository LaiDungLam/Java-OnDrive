package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount(); 
		acc1.accountNumber = "0102343"; 
		
		//acc1.name = "Roger Hue"
		//with Encapsulation: pulbic API methods
		//encapsulation == hiding
		
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.balance = 1000; 
		acc1.deposit(1500);
		acc1.deposit(2000);
		acc1.deposit(350000);
		acc1.withdraw(5000);
		System.out.println(acc1.toString());
		
		acc1.setSsn("134355666");
		System.out.println(acc1.getSsn());
		
		acc1.setRate();
		
		
		//polymorphisim through overloading
		BankAccount acc2 = new BankAccount(" CHECKING ACCOUNT"); 
		
		BankAccount acc3 = new BankAccount("Saving Account", 10000); 
		
		CDAccount cd1 = new CDAccount(); 
		cd1.interestRate = 0.1; 
		cd1.balance = 3000; 
		cd1.name = "Juan"; 
//		cd1.accountType = "CD Account";
		
		//polymorphism through overridding 
		System.out.println(cd1.toString()); 
		cd1.compound();
	}

}
