package Collection_Employee;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchUtilE {

@SuppressWarnings({ "rawtypes", "unused", "resource" })
public static void searchEmployee(ArrayList a1) {
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter Employee Id:");
	int empId=s1.nextInt();
	boolean flag= false;
	for(Object ob:a1) {
		Employee e = (Employee) ob;
		if(e.employeeId==empId) {
			System.out.println("Employee Info:"+e);
			flag = true;
			break;
		}
	}
	if (flag= false) {
		System.out.println("Employee Not Found");
	}
	
}
}

