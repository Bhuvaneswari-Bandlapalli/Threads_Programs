package com.deepclone;

public class Course implements Cloneable{
	private int cid;
	private String cname;
	private double cfee;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getCfee() {
		return cfee;
	}
	public void setCfee(double cfee) {
		this.cfee = cfee;
	}
	
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	

}
