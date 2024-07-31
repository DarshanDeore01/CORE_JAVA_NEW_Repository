package inheritance_Practice;

public class Account 
{
protected int accNo;
protected String name;

public Account()
{
	accNo=13761;
	name="darshan";
 
}
public Account(int accNo,String name)
{
	this.accNo=accNo;
	this.name=name;
}

//public String toString()
//{
//	return accNo+" "+name;
//}
public void print()
{
	System.out.println("Account No :"+accNo);
	System.out.println("Account Holder Name :"+name);
}
}


