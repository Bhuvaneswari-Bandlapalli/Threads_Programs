package com.sincronization;

public class TestMyBlock {

	public static void main(String[] args) {
		MyClass m=new MyClass();
		Thread t=new Thread() {
			public void run() {
				m.m1();
			}
		};
		t.start();
		MyClass m1=new MyClass();
		Thread t1=new Thread() {
			public void run() {       //multiple instances 
				m.m1();
			}
		};
		t1.start();
		

	}

}
