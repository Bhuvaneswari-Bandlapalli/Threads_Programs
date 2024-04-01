package com.block.sync;

public class TestMultiLines {

	public static void main(String[] args) {
		MultipleInstances m=new MultipleInstances();
		Thread t=new Thread() {
			public void run() {
				 
				 m.m1();
			}
		};
		t.start();
		MultipleInstances m1=new MultipleInstances();
		Thread t1=new Thread() {
			public void run() {
				 
				 m1.m1();
			}
		};
		t1.start();

	}


	}


