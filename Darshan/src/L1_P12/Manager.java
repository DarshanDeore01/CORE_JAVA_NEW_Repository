package L1_P12;

public class Manager extends Employee {
    private double petrolAllowance;
    private double foodAllowance;
    private double otherAllowance;

    public Manager(int empId, String name, double basicSalary) {
        super(empId, name, basicSalary);
        petrolAllowance = 0.08 * basicSalary;
        foodAllowance = 0.13 * basicSalary;
        otherAllowance = 0.03 * basicSalary;
    }

    @Override
    public double calculateGrossSalary() {
        grossSalary = basicSalary + petrolAllowance + foodAllowance + otherAllowance;
        return grossSalary;
    }

    @Override
    public void calculateNetSalary() {
        super.calculateNetSalary();
        
    }

    @Override
    public String toString() {
        return super.toString() + "\nPetrol Allowance: " + petrolAllowance + "\nFood Allowance: " + foodAllowance + "\nOther Allowance: " + otherAllowance;
    }

    @Override
    public void showDetails() {
        calculateGrossSalary();
        calculateNetSalary();
        super.showDetails();
    }
}
