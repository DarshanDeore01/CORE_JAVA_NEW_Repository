package inheritance_Practice;

public class SavingAccount extends Account 
{
private double accBalance;
private double investments;

public SavingAccount()
{
	accBalance=25000;
	investments=15000;        
}

public SavingAccount(double accBalance, double investments,int accNo, String name)
{
	super(accNo,name);
	this.accBalance=accBalance;
	this.investments=investments;
}

//public String toString()
//{
//	return super.toString()+" "+accBalance+" "+investments;
//}
public void print()
{
	System.out.println("Account Balance:"+accBalance);
	System.out.println("Account Investment :"+investments);
}
}

