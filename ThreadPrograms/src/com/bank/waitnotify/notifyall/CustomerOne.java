package com.bank.waitnotify.notifyall;

public class CustomerOne {

	public static void main(String[] args) {
		atm m=new atm();
		Thread t=new Thread() {
			public void run() {
				m.withdraw(9000);
			}
		};
		
		Thread t1=new Thread() {
			public void run() {
				m.withdraw(8000);
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				m.deposit(50000);
			}
		};
		t1.start();
		t.start();
		
		try {
			Thread.sleep(4000);
			t2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	




}
