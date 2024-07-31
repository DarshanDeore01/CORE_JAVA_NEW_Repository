package Acc_Thr;

public class Transaction extends Thread {

	Account aob;
	  
	  public Transaction()
	  {
		  
	  }
 
	  public Transaction(String name, Account a)
	  {
		  super(name);
		  aob=a;
	  }
	  
	  public void withdraw(int amount) 
	   {
		  synchronized (aob)
	  {
		  int b=aob.getBalance();
		  System.out.println("********* Your Balance Before Withdraw = " +b);
		  b=b-amount;
		  aob.setBalance(b);
		  System.out.println("********* Your Balance After Withdraw = " +b);
	  }
	   }
	  
	  public void deposite(int amount)
	  {
		  synchronized (aob) {
			  int b=aob.getBalance();
			  System.out.println("********* Your Balance Before Deposite = " +b);
			  b=b+amount;
			  aob.setBalance(b);
			  System.out.println("********* Your Balance After Deposite = " +b); 
		}
			}
		  
		public void run()
		{
			if(Thread.currentThread().getName().equals("Darshan"))
				deposite(10000);
			if(Thread.currentThread().getName().equals("Divyam"))
				withdraw(20000);
		}
}
