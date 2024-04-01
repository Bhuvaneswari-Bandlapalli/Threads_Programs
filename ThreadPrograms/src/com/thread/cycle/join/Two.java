package com.thread.cycle.join;

public class Two extends Thread {
	
	public void run() {
		for(int i=0;i<=20;i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+"---"+i);
		}
	}

	public static void main(String[] args) {
		Two t=new Two();
		t.start();
		for(int i=0;i<=10;i++) {
			
			System.out.println(Thread.currentThread().getName()+"---"+i);
		}

	}


}
