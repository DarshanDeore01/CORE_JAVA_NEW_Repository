package Basics;
import java.util.*;

public class Employee 
{
   int eid;
   String ename;
   int esal;
   static int count;
   
   static 
   {
	   count=0;
	   System.out.println("Static Block 1.....");
   }
   static 
   {
	   System.out.println("Static Block 2.....");
   }
   public Employee() 
   {
	   eid=0;
	   ename=null;
	   esal=0;
	   count++;
   }
   public Employee(int eid, String ename, int esal) 
   {
	count++;
	this.eid = eid;
	this.ename = ename;
	this.esal = esal;
  }
   public void accept()
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Employee ID: ");
	   eid=sc.nextInt();
	   System.out.println("Employee Name: ");
	   ename=sc.next();
	   System.out.println("Employee Salary: ");
	   esal=sc.nextInt();
	}
   public void display()
   {
	   System.out.println("Employee ID: "+eid);
	   System.out.println("Employee Name: "+ename);
	   System.out.println("Employee Salary: "+esal);
	  // System.out.println("Employee Count: "+count);
   }
   public static void displayCount()
   {
	   System.out.println("Employee Count:"+count);
   }
   
   public static void main(String[] args) 
   {
	   System.out.println("main method called...");
	   Employee e1 = new Employee();
	   e1.accept();
	   e1.display();
	   
	   Employee e2 = new Employee(101, "Darshan", 10000);
	   e2.accept();
	   e2.display();
	   
	   Employee e3 = new Employee();
	   e3.accept();
	   e3.display();
	   
	   Employee.displayCount();
//	   {
//		   System.out.println("Employee Count:"+Employee.count);
//	   }
   }
   static 
   {
	   System.out.println("static block 3....");
   }
   
}
