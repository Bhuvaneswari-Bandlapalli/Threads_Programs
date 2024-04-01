package com.bank.waitnotify.notifyall;

public class atm2 {
	public static int balance=8790;
	public void withdraw(int wamount) {
		System.out.println("immediate current balance: "+balance);
		
		if(wamount<=balance) {
			balance=balance-wamount;
			System.out.println("after withdraw: "+balance);
		}else {
			System.out.println("insufficient balance");
			synchronized (this) {
			try {
				wait();
				System.out.println("notification recieved ");
				balance=balance-wamount;
				System.out.println("after withdraw: "+balance);
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		
	}
	public void deposit(int damount) {
		System.out.println("deposit amount: ");
		balance=balance+damount;
		System.out.println("I am giving the notification after the deposit.");
		 synchronized(this) {
		notify();
		System.out.println("after deposit: "+balance);
		 }
	}

}
