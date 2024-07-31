package reflection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;

public class Demo4 {
	
	public static void main(String[] args) {;
		
	ArrayList<Student> l1=new ArrayList<Student>();
	//ArrayList l1 = new ArrayList();
	l1.add(new Student(1,"Pooja",78.3));
	l1.add(new Student(5,"Anita",78.3));
	l1.add(new Student(3,"Sanket",78.3));
	l1.add(new Student(7,"Kiran",78.3));
	
	
	//System.out.println(l1);
	
	//1. display using iterator
	//DisplayUtil.displayStudent(l1);
	
	
	//2. search student
	SearchUtil.searchStudent(l1);
	
	
	// 3.sorting
	
	//  Collections.sort(l1);//compareTo
	//  System.out.println("After Sort");
	//  DisplayUtil.displayStudent(l1);
	   
	}
}









