package L1_P12;

public class MarketingExecutive extends Employee 
{
	private int kilometersTravelled;
    private double tourAllowance;
    private static final double teleAllow = 1500;

    public MarketingExecutive(int empId, String name, double basicSalary, int kilometersTravelled)
    {
        super(empId, name, basicSalary);
        this.kilometersTravelled = kilometersTravelled;
        tourAllowance = kilometersTravelled * 5;
    }

    public double calculateGrossSalary()
    {
        return grossSalary = basicSalary + tourAllowance + teleAllow;
    }

   
    public void calculateNetSalary() 
    {
        super.calculateNetSalary();
        
    }

 
    public String toString() 
    {
        return super.toString() + "\nKilometers Travelled: " + kilometersTravelled + "\nTour Allowance: " 
    + tourAllowance + "\nTelephone Allowance: " + teleAllow;
    }

   
    public void showDetails() 
    {
    	 super.showDetails();
        calculateGrossSalary();
        calculateNetSalary();
       
        
    }
}
