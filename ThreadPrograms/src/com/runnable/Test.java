package com.runnable;

public class Test implements Runnable {
	public void run() {
		System.out.println("hi");
		//System.out.println(Thread.currentThread().getName());
		m1();
		m2();
	}
	public void m1() {
		System.out.println("hello");
	}
	public void m2() {
		System.out.println("hello 2");
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Test t=new Test();
		Test t1=new Test();
		
		Thread ta=new Thread(t);
		
		ta.start();
		Thread ta1=new Thread(t1);
	
		ta1.start();
	}

}
