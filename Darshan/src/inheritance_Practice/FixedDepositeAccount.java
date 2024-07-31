package inheritance_Practice;

public class FixedDepositeAccount extends Account 
{
private double FdAmount;
private int Tenure;

public FixedDepositeAccount()
{
	FdAmount=50000;
	Tenure=24;        
}

public FixedDepositeAccount(double FdAmount, int Tenure ,int accNo, String name)
{
	super(accNo,name);
	this.FdAmount=FdAmount;
	this.Tenure=Tenure;
}

//public String toString()
//{
//	return super.toString()+" "+FdAmount+" "+Tenure;
//}
public void print()
{
	System.out.println("FD Ammount:"+FdAmount);
	System.out.println("FD Tenure :"+Tenure);
}
}