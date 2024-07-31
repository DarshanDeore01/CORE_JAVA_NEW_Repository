package Collection_Employee;

public class Employee {
	public int employeeId;
    public String name;
    public double salary;
 

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + name + " ,Salary:" + salary;
    }

}

