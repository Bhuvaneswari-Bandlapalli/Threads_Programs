package com.ticket;

public class LoginOne {

	public static void main(String[] args) {
		TicketOne b=new TicketOne();
		Thread t=new Thread(b) 
		{
			public void run() {
				b.tBook();
			}
		};
		t.start();
		Thread t1=new Thread(b) {
			public void run() {
				b.m2();
			}
		};
		t1.start();
		Thread t2=new Thread(b) {
			public void run() {
				b.m1();
			}
		};
		t2.start();
	}

}
