package com.bank.waitnotify.notifyall;

public class Customer {

	public static void main(String[] args) {
		atm m=new atm();
		Thread t=new Thread() {
			public void run() {
				m.withdraw(9000);
			}
		};
		Thread t1=new Thread() {
			public void run() {
				m.deposit(5000);
			}
		};
		t.start();
		t1.start();
	}

}
