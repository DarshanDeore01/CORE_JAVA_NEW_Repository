package inheritance_Practice;
public class BankMain {

	public static void main(String[] args) {
		
		Account a1= new Account (12120180,"Darshan");
		System.out.println(a1);
		a1.print();
		
		SavingAccount s1= new SavingAccount (50000,30000,123456789,"Darshan");
		System.out.println(s1);
		s1.print();
				
		FixedDepositeAccount f1=new FixedDepositeAccount(80000,28,12121212,"Deepak");
	    System.out.println(f1);
	    f1.print();
	      }

}
