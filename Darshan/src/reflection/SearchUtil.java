package reflection;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchUtil {
	
	public static void searchStudent(ArrayList a1)
	{
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter roll no :");
		int rn=s1.nextInt();
		boolean flag=false;
		 for(Object ob: a1)
		 {
			 Student s= (Student) ob;
			 if (s.rollno==rn)
			 {
				 System.out.println("Student Info :"+s);
				 flag=true;
				 break;
			 }
		 }
		 if(flag==false)
		 {
			 System.out.println("Student not found");
		 }
	}
	

}
