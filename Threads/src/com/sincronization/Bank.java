package com.sincronization;

import java.util.Scanner;

public class Bank {
	public static int balance=34567;
	Scanner sc=new Scanner(System.in);
	public synchronized void deposit() {
		System.out.println("enter the amount for deposit: ");
		int amount=sc.nextInt();
		balance=balance+amount;
		System.out.println("deposit: "+balance);
	}
	public synchronized void withdraw() {
		System.out.println("enter the withdraw amount: ");
		int wamount=sc.nextInt();
		
		if(balance>=wamount) {
			balance=balance-wamount;
		System.out.println("after withdraw balance: "+wamount);
		
	}else {
		System.out.println("insuficeint balance");
	}
	}

	public static void main(String[] args) {
		Bank b=new Bank();
		Thread thread1=new Thread() {
			public void run() {
				b.deposit();
			}
		};
		thread1.start();
		Thread thread2=new Thread() {
			public void run() {
				b.withdraw();
			}
		};
		thread2.start();

	}

}
