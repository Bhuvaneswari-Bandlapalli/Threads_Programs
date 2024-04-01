package com.wait_notify;

public class Atm {
	public static int balance=7896;
	public synchronized void withdraw(int wamount) {
		System.out.println("current immediate balance: "+balance);
		if(balance>=wamount) {
			balance=balance-wamount;
			System.out.println("after withdraw amount: "+balance);
			
		}else {
			System.out.println("Insufficeint balance");
			try {
				wait();
				System.out.println("Notification recieved");
				balance=balance-wamount;
				System.out.println("after withdraw amount: "+balance);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
		public synchronized void diposit(int damount) {
			System.out.println("deposit the  amount");
			balance=balance+damount;
			System.out.println("I am giving the notification after the diposit");
			notify();
			System.out.println("after the deposit amount: "+balance);
		}
	

}
