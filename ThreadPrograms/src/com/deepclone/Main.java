package com.deepclone;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e=new Employee();
		e.setId(1);
		e.setName("Bhuvana");
		e.setSalary(123.4677);
		
		Course c=new Course();
		c.setCid(1);
		c.setCname("java");
		c.setCfee(3456.78);
		e.setCo(c);
		System.out.println("Original Object: "+e.getId()+"--"+e.getName()+"---"+e.getSalary()+"---"+e.getCo().getCid()+"---"+e.getCo().getCname()+"---"+e.getCo().getCfee());
		
		Employee e1=(Employee)e.clone();
		System.out.println("Clone Object: "+e1.getId()+"--"+e1.getName()+"---"+e1.getSalary()+"---"+e1.getCo().getCid()+"---"+e1.getCo().getCname()+"---"+e1.getCo().getCfee());
		
		//e.setName("rukmini");
		e.getCo().setCname("mysql");
		System.out.println("Original Object: "+e.getId()+"--"+e.getName()+"---"+e.getSalary()+"---"+e.getCo().getCid()+"---"+e.getCo().getCname()+"---"+e.getCo().getCfee());
		
		System.out.println("clone  Object: "+e1.getId()+"--"+e1.getName()+"---"+e1.getSalary()+"---"+e1.getCo().getCid()+"---"+e1.getCo().getCname()+"---"+e1.getCo().getCfee());
		

	}

}
