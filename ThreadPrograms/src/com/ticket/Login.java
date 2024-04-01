package com.ticket;

public class Login {

	public static void main(String[] args) {
		TicketBooking b=new TicketBooking();
		Thread t=new Thread(b);
		t.start();
		Thread t1=new Thread(b);
		t1.start();

	}

}
