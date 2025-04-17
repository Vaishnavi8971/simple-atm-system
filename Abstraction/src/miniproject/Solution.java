package miniproject;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		System.out.println("WELL COME TO ATM");
		System.out.println("--------");
		Scanner sc =new Scanner(System.in);
		Bank b=new Atm();
		while(true) {
		System.out.println("1:Deposit \n2:Withdraw \n3:balence \n4:exit");
		System.out.println("enter choice:");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("enter the amount to be deposit");
			int dAmt=sc.nextInt();
			b.deposit(dAmt);
			break;
			
		case 2:
			System.out.println("enter the withdrawal amount");
			int wAmt=sc.nextInt();
			b.withdraw(wAmt);
			break;
			
		case 3:
			b.balence();
			break;
		case 4:
			System.out.println("Thank you!..");
			System.exit(0);
			
		}
		}

	}

}
