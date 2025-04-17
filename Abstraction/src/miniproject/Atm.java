package miniproject;

public class Atm implements Bank{
	int balence=1000;
	
	public void deposit(int amount) {
		System.out.println("Depositing: RS " +amount);
		balence += amount;
		System.out.println("Amount deposited successfully");
	}
	public void withdraw(int amount) {
		System.out.println("Withdrowing: RS " +amount);
		balence=balence-amount;
		System.out.println("Amount withdrawed successfully");
	}
	public void balence() {
		System.out.println("Balence is: RS " +balence);
	}


}

