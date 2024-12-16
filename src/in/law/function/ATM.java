package in.law.function;

import java.util.Scanner;

public class ATM {
	private double balance;
	private int PIN = 1234;

	Scanner sc = new Scanner(System.in);

	public void checkPin() {
		System.out.println("Enter your PIN");
		int checkPin = sc.nextInt();
		if (checkPin == PIN) {
			menu();
		} else {
			System.out.println("Invalid PIN, Please enter correct PIN !!!");
			checkPin();
		}
	}

	private void menu() {
		System.out.println("Enter your choise: ");
		System.out.println("1. Check A/c Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. Exit");
		int choise = sc.nextInt();

		if (choise == 1) {
			checkBalance();
		} else if (choise == 2) {
			withdrawMoney();
		} else if (choise == 3) {
			depositMoney();
		} else if (choise == 4) {
			System.out.println("Thank you ! , come Again , Have a good day !");
			return;
		} else {
			System.out.println("enter a valid choise");
			menu();
		}
	}
	
	


	private void checkBalance() {
		System.out.println("Balance: "+ balance);
		menu();
	}

	private void withdrawMoney() {
		System.out.println("Enter amount to Withdraw");
		double withdrawAmount = sc.nextDouble();
		if(withdrawAmount>balance) {
			System.out.println("Insufficient Balance");
		}else {
			balance=balance-withdrawAmount;
			System.out.println("Money Withdraw Successfully");
		}
		menu();
	}
	private void depositMoney() {
		System.out.println("Enter amount to Deposit");
		double depositAmount = sc.nextDouble();
		balance=balance+depositAmount;
		System.out.println("Money Deposit Successfully");
		
		menu();
	}
}
