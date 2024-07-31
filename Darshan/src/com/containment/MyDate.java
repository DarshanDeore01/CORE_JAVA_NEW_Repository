package com.containment;

public class MyDate {

	private int day, month, year;
	
	public MyDate()
	{
		this.day=10;
		month=10;
		year=2010;
	}
    public MyDate(int day, int month, int year)
    {
    	this.day=day;
    	this.month=month;
    	this.year=year;
    }
       
    public String toString()
    {
    	return this.day+"/"+this.month+"/"+this.year;
    }
}
