package com.thread_class;

public class One extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		One one=new One();
		Thread t=new Thread(one);
		t.start();
	}

}
