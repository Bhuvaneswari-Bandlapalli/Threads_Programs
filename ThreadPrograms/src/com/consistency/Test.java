package com.consistency;

import com.ticket.TicketOne;

public class Test {

	public static void main(String[] args) {
		TicketOne b=new TicketOne();
		Thread t=new Thread(b) 
		{
			public void run() {
				b.tBook();
			}
		};
		t.start();
		TicketOne b2=new TicketOne();
		
		Thread t1=new Thread(b2) {
			public void run() {
				b2.m2();
			}
		};
		t1.start();
		TicketOne b1=new TicketOne();
		
		Thread t2=new Thread(b1) {
			public void run() {
				b1.m1();
			}
		};
		t2.start();
	}


	}


