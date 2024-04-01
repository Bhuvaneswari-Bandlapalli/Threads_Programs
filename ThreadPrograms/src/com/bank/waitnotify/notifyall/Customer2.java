package com.bank.waitnotify.notifyall;

public class Customer2 {

	public static void main(String[] args) {
		atm m=new atm();//if we create two instances for two different threads this (wait,notyfy,notify all )not work.
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
		try {
			Thread.sleep(800);
			t1.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
