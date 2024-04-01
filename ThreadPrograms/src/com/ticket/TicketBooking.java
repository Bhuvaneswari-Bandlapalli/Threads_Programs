package com.ticket;

public class TicketBooking implements Runnable {
	public synchronized void tBook() {
		
			try {
				for(int i=0;i<=20;i++) {
					Thread.sleep(1200);
					System.out.println(i+"==="+Thread.currentThread().getName());
				
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
	}

	@Override
	public void run() {
		tBook();
		
		
	}
}
