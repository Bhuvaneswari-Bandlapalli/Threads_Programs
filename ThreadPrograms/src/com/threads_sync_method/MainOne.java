package com.threads_sync_method;

public class MainOne {

	public static void main(String[] args) {
		OneString o=new OneString();
		Thread t=new Thread() {
			public void run() {
				o.one("bhuvana");
			}
		};
		Thread t1=new Thread() {
			public void run() {
				o.two("java");
			}
		};
		t.start();
		
		t1.start();
	}

}
