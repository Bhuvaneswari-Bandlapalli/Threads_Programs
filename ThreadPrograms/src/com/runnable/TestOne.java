package com.runnable;

public class TestOne extends Thread{
	public static void m1() {
		System.out.println("m1=="+Thread.currentThread().getName());
		
	}
	public static void m2() {
		System.out.println("m2=="+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		TestOne t=new TestOne() {
			public void run() {
			  m1();
			}
		};
		t.start();
		TestOne t2=new TestOne() {
			public void run() {
				m2();
			}
		};
		t2.start();

	}

}
