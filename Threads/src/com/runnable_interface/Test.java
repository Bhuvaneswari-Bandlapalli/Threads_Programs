package com.runnable_interface;

public class Test implements Runnable {
	int a=20; int b=10;
	public static int h=90;
	public static int d=30;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		add();
		sub();
		multiply();
		
	}
	public void add() {
		//System.out.println(Thread.currentThread().getName());
		int addition=a+b;
		System.out.println("addition of two numbers: "+addition);
	}
	public int sub() {
		int subtraction=a-b;
		//System.out.println(Thread.currentThread().getName());
		System.out.println("subtraction of two numbers: "+subtraction);
		return subtraction;
	}
	public static void multiply() {
		//System.out.println(Thread.currentThread().getName());
		System.out.println("multiplycation of two numbers: "+(h*d));
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Test t=new Test();
		Thread th=new Thread(t);
		th.start();
		
	}

	

}
