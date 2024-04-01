package com.daemon;

public class Tesy extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName()+"  daemon Thread");
		}else {
			System.out.println(Thread.currentThread().getName()+" user thread");
			
		}
	}

	public static void main(String[] args) {
		Tesy t1=new Tesy();
		t1.setDaemon(true);
		t1.start();
		//t1.setDaemon(true);  illegalthreadstateException
		
		
		Tesy t=new Tesy();
		t.start();
		//daemon thread runs behind the screen.main is not a daemon thread.it support to run user defined threads

	}

	

}
