package com.thread_class;

public class Two extends Thread{
	public void read() {
		System.out.println("read: "+Thread.currentThread().getName());
	}
	public void write() {
		System.out.println("write: "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
		Two two=new Two();
		Thread t1=new Thread() {
			public void run() {
				two.read();
			}
		};
		t1.start();
		
		Thread t2=new Thread() {
			public void run() {
				two.write();
			}
		};
		t2.start();
	}

}
