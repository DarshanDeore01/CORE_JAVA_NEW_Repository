package Acc_Thr;

public class Account {

	private int balance;
	
	public Account ()
	{
		balance=50000;
	}
	
	public Account (int bal)
	{
		this.balance=bal;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	
	public String toString()
	{
		return "balance = "+balance;
	}
	
	}
