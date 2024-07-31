package com.containment;

public class MainEmployee {
public static void main(String[] args)
{
	Employee e1= new Employee();
	System.out.println(e1);
	MyDate d=new MyDate(11,11,2011);
	Employee e2=new Employee(101,"Darshan",50000,d);
	System.out.println(e2);
}
}
