package com.sincronization;

public class Voting_Method extends Thread {
	public synchronized void polingVote(int age) {
		if(age>=18) {
			System.out.println(Thread.currentThread().getName()+" is eligible for voting.");
			}
		else {
			System.out.println(Thread.currentThread().getName()+" is not eligible for voting");
		}
	}

}
