package com.deepclone;

public class Employee implements Cloneable {
	private int id;
	private String name;
	private double salary;
	private Course co;
	public Course getCo() {
		return co;
	}
	public void setCo(Course co) {
		this.co = co;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Object clone() throws CloneNotSupportedException {
		
		Employee z=(Employee) super.clone();
		
		z.co=(Course)co.clone();
		
		return z;
	}

}
