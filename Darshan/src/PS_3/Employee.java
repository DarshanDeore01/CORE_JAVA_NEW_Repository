package PS_3;

public class Employee {
    private int empId;
    private String empName;
    private double basicSalary;
    private double hra;
    private double medical;
    private double pf;
    private double pt;
    private double netSalary;
    private double grossSalary;

    public Employee(int empId, String empName, double basicSalary, double medical)
    {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        this.medical = medical;
        this.hra = 0.5 * basicSalary;
        this.pf = 0.17 * basicSalary;
        this.pt = 200.0;
        calculateGrossSalary();
        calculateNetSalary();
    }

    private void calculateGrossSalary() 
    {
        this.grossSalary = basicSalary + hra + medical;
    }

    private void calculateNetSalary() 
    {
        this.netSalary = grossSalary - pf - pt;
    }

    public void displayDetails()
    {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("Medical Allowance: " + medical);
        System.out.println("PF: " + pf);
        System.out.println("PT: " + pt);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}
