package Acc_Thr;

public class Acc_Main {

	public static void main(String[] args) {
	
		Account obj= new Account(50000);
		Transaction t1= new Transaction("Darshan", obj);
		Transaction t2= new Transaction("Divyam", obj);		

		t1.start();
		t2.start();
	}

}
