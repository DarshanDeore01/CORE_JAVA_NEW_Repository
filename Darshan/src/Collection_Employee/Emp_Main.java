package Collection_Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;

			
@SuppressWarnings("unused")
public class Emp_Main {
	@SuppressWarnings({ "unchecked", "resource" })
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		ArrayList l1 = new ArrayList();
		l1.add(new Employee(101, "Divyam", 2200.00));
		l1.add(new Employee(102, "Abhi", 1100.00));
		l1.add(new Employee(103, "Nikhil", 3000.00));
		l1.add(new Employee(104, "Sahil", 4000.00));

		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Menu:");
			System.out.println("1. Search Employee");
			System.out.println("2. Display Employees");
			System.out.println("3. Sort Employees");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				SearchUtilE.searchEmployee(l1);
				break;
			case 2:
				DisplayUtilE.displayEmployee(l1);
				break;
			case 3:
				System.out.println("Sort by:");
				System.out.println("a. Employee ID");
				System.out.println("b. Name");
				System.out.println("c. Salary");
				System.out.print("Enter your choice: ");
				char sortChoice = scanner.next().charAt(0);

				switch (sortChoice) {
				case 'a':
					Collections.sort(l1);
					System.out.println("After Sort by Emp Id");
					DisplayUtilE.displayEmployee(l1);
					break;
				case 'b':
					Collections.sort(l1, new CompareByName());
					System.out.println("After Sort by Name");
					DisplayUtilE.displayEmployee(l1);
					break;
				case 'c':
					Collections.sort(l1, new CompareBySalary());
					System.out.println("After Sort by Salary");
					DisplayUtilE.displayEmployee(l1);
					break;
				default:
					System.out.println("Invalid choice! Please select a, b, or c.");
					break;
				}
				break;
			case 4:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice! Please select 1, 2, 3, or 4.");
				break;
			}
		} while (choice != 4);

	}

}