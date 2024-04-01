package com.ticket;

public class TicketOne extends Thread {
	public void m2(){
		try{
			for(int i=0;i<=20;i++) {
			Thread.sleep(1200);
			System.out.println(i+"==normal method m2="+Thread.currentThread().getName());
			}
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}
	public synchronized void m1(){
		try{
			for(int i=0;i<=20;i++) {
			Thread.sleep(1200);
			System.out.println(i+"== synch method m1="+Thread.currentThread().getName());
			}
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}
	
	
	public synchronized void tBook(){
		try{
			for(int i=0;i<=20;i++) {
			Thread.sleep(1200);
			System.out.println(i+"==synch method tbook=="+Thread.currentThread().getName());
			}
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}
}
