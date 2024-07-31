package com.containment;

public class Employee {

	private int empid;
	private String name;
	private double salary;
	private MyDate doj;
	
	public Employee()
	{
		empid=100;
		name="Darshan";
		salary=25000;
		doj=new MyDate();
			
	}
	
	public Employee(int id,String name,double salary,MyDate doj)
	{
		this.empid=id;
		this.name=name;
		this.salary=salary;
		this.doj=doj;
		
		
	}
	
	public String toString()
	{
           return empid+" "+name+" "+salary+" "+doj;	
	}
}
