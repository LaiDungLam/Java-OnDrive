package oop;

public class LoanAccount implements IRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("Rate"); 
		
	}

	public void increaseRate() {
		// TODO Auto-generated method stub
		System.out.println("Increase Rate"); 
	}
	
	public void setTerm(int terms) {
		System.out.println("Setting the terms to: " + terms + " years");
	}
	
	public void setAmortSchedule () {
		System.out.println("Amortization schedule");
	}

}
