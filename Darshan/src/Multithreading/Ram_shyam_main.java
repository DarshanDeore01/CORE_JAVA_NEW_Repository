package Multithreading;

public class Ram_shyam_main {

	public static void main(String[] args)
	{
		Ram_shyam d1= new Ram_shyam();
		d1.setName("Darshan");
		d1.start();
		
		Ram_shyam d2= new Ram_shyam();
		d2.setName("Deore");
		d2.start();
		

	}

}
