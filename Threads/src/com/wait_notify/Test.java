package com.wait_notify;

public class Test {

	public static void main(String[] args) {
		Atm a=new Atm();
		Thread t=new Thread() {
			public void run() {
				a.withdraw(20000);
			}
		};
		t.start();
		Thread t1=new Thread() {
			public void run() {
				a.diposit(30000);;
			
			}
		};
		t1.start();
	}

}
