package com.block.sync;

public class TestLines {

	public static void main(String[] args) {
		SingleInstance m=new SingleInstance();
		Thread t=new Thread(m) {
			public void run() {
				 
				 m.m1();
			}
		};
		t.start();
		Thread t1=new Thread(m) {
			public void run() {
				 
				 m.m1();
			}
		};
		t1.start();

	}

}
