package com.sincronization;

public class Test_voting {

	public static void main(String[] args) {
		Voting_Method vm=new Voting_Method();
		Thread t=new Thread() {
			public void run() {
				vm.polingVote(16);
			}
		};
		t.start();

	}

}
