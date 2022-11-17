package com.ct.bank.ui;

import java.util.List;
import java.util.Scanner;

import com.ct.bank.exception.AccountNotFound;
import com.ct.bank.modal.Account;
import com.ct.bank.modal.Transaction;
import com.ct.bank.service.AccountService;
import com.ct.bank.service.AccountServiceImpl;

public class Client {
	public static void main(String[] args) {
		long accNo = 0;
		String accHolderName;
		int age;
		String branch;
		int balance;
		String address;
		String typeOfAccount;
		long contactNo;
		AccountService service = new AccountServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("***** CT BANK *********");
		while (true) {
			System.out.println("1.Create Account");
			System.out.println("2.Display Account Details");
			System.out.println("3.Withdraw");
			System.out.println("4.Deposit");
			System.out.println("5.Fundtransfer");
			System.out.println("6.PrintTransactions");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter Your Name:");
				accHolderName = sc.next();
				System.out.println("Enter Your Age:");
				age = sc.nextInt();
				System.out.println("Enter Your Branch:");
				branch = sc.next();
				System.out.println("Enter Your Amount:");
				balance = sc.nextInt();
				System.out.println("Enter Your Address:");
				address = sc.next();
				System.out.println("Enter Your Acc Type:");
				typeOfAccount = sc.next();
				System.out.println("Enter Your Account Num:");
				contactNo = sc.nextLong();

				Account acc = new Account(accNo, accHolderName, age, branch, balance, address, typeOfAccount,
						contactNo);
				long acno = service.createAccount(acc);
				System.out.println("Account created successfully  with accno:" + acno);
				break;
			case 2:
				System.out.println("Enter Your Account Num:");
				accNo = sc.nextLong();
				System.out.println(service.getAccountDetails(accNo));
				//try {
				//Account account=service.getAccountDetails(accNo);
				//System.out.println(account);
				//}
				//catch (AccountNotFound e) {
					//System.out.println("Account Number is invalid !!!");
				//}
				
				break;
			case 3:
				System.out.println("Enter Your Account Num:");
				accNo = sc.nextLong();
				System.out.println("Enter Amount To Withdraw:");
				balance = sc.nextInt();
				System.out.println(service.withdraw(accNo, balance));
				//try {
				//System.out.println(service.withdraw(accNo, balance));
				//}catch (AccountNotFound e) {
				//	System.out.println("Account Number is invalid !!! or withdrawl amount invalid");
				//}
				break;
			case 4:
				System.out.println("Enter Your Account Num:");
				accNo = sc.nextLong();
				System.out.println("Enter Amount To Deposit:");
				balance = sc.nextInt();
				System.out.println(service.deposit(accNo, balance));
				break;
			case 5:
				System.out.println("Enter From Account Num:");
				long fromaccNo = sc.nextLong();
				System.out.println("Enter To Account Num:");
				long toaccNo = sc.nextLong();
				System.out.println("Enter Amount To Transfer:");
				balance = sc.nextInt();
				System.out.println(service.fundtransfer(fromaccNo, toaccNo, balance));
				break;
			case 6:
				List<Transaction> transactions = service.printTransactions();
				transactions.forEach(System.out::println);
				break;
			default:
				System.out.println("Thank You......");
				System.exit(0);
				break;
			}
		}
	}
}
