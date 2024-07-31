package L1_P12;

public abstract class Employee {
    protected int empId;
    protected String name;
    protected double basicSalary;
    protected double grossSalary;
    protected double netSalary;
    protected double pf;

    public Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public abstract double calculateGrossSalary();
    
    public void calculateNetSalary() {
        pf = 0.12 * basicSalary;
        netSalary = basicSalary - pf;
    }

  
    public String toString() {
        return "Employee ID: " + empId + "\nName: " + name + "\nBasic Salary: " + basicSalary;
    }

    public void showDetails() {
        System.out.println(this);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}
