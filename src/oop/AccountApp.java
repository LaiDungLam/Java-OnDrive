package oop;

public class AccountApp extends BankAccount implements IRate {
	public static void main(String[] args) {
		LoanAccount la = new LoanAccount(); 
		la.increaseRate();
		la.setRate();
		la.setAmortSchedule();
		la.setTerm(20);
		
		//polymorphism changes where wer are pointing
		IRate account1 = new LoanAccount(); 
		account1.setRate();
		account1.increaseRate();
	}
}
