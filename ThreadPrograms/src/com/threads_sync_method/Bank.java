package com.threads_sync_method;
import java.util.*;
public class Bank 
{
	 
	public static int balance=890;
	public synchronized void deposit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the deposit amount: ");
		int amount=sc.nextInt();
		balance=balance+amount;
		System.out.println("diposit : "+balance);
		
	}
	public synchronized void withdraw() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the with draw amount: ");
		int amount1=sc1.nextInt();
		if(amount1<=balance) {
			balance=balance-amount1;
			System.out.println("remaining balance: "+balance);
		}
		else {
			System.out.println("insufficient balance");
		}
		
		
		
	}

	public static void main(String[] args) {
		Bank b=new Bank();
		Thread t=new Thread() {
			public void run() {
				
				b.deposit();
			}
		};
		t.start();
		Thread t1=new Thread() {
			public void run() {
				b.withdraw();
			}
		};
		t1.start();
		}

}
