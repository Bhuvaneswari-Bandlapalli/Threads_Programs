package com.thread.cycle.join;

public class One extends Thread{

	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+"----"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		One o=new One();
		o.start();
		try {
			o.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		One o1=new One();
		o1.start();
	}

}
