package com.one.runnable;



public class TestThree extends Thread {

	public void m1() {
		System.out.println("m1=="+Thread.currentThread().getName());
		
	}
	public static void m2() {
		System.out.println("m2=="+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		TestThree o=new TestThree();
		Thread t=new Thread() {
			public void run() {
			 o. m1();
			}
		};
	t.start();
		Thread t2=new Thread() {
			public void run() {
				m2();
			}
		};
		t2.start();

	}

}
