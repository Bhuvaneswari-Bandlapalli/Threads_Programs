package com.block.sync;

public class SingleInstance extends Thread {
	public void m1() {
		for(int i=0;i<=20;i++) {
			try {
				Thread.sleep(120);
				System.out.println(Thread.currentThread().getName()+"==non sync===="+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		synchronized (this) {
			for(int i=0;i<=20;i++) {
				try {
					Thread.sleep(120);
					System.out.println(Thread.currentThread().getName()+"==sync===="+i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
	
	
	
	
	
	
	
	
	
}
}
