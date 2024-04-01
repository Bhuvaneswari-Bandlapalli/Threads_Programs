package com.threads_sync_method;

public class One extends MyThread {
	

	public void run() {
		System.out.println("my class run method");
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		//MyThread mt=new MyThread();
		One o=new One();
		o.start();
		//mt.start();
	

	}

}
