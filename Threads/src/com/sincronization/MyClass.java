package com.sincronization;

public class MyClass extends Thread {
	public void m1() {
		try {
			for(int i=0;i<=10;i++ ) {
				Thread.sleep(120);
				System.out.println(Thread.currentThread().getName()+" ----non sync---"+i);
			}
			
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		//synchronized(this) { //single instance
		synchronized(MyClass.class) {//multiple instances
			
			try {
				for(int i=0;i<=10;i++ ) {
					Thread.sleep(120);
					System.out.println(Thread.currentThread().getName()+" ----sync---"+i);
				}
				
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
