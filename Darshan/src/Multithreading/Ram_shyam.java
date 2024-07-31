package Multithreading;

public class Ram_shyam extends Thread
{
       public void run()
       {
    	   try 
    	   {
    	    for(int i=1 ;i<10; i++)
    	   { 
    	    	if(currentThread().getName().equals("Darshan"))
    	    	{
    	    		System.out.println("Hiii....."+getName());
    	    		Thread.sleep(500);
    	    	}
    	    	if(currentThread().getName().equals("Deore"))
    	    	{
    	    		System.out.println("Byyy....."+getName());
    	    		Thread.sleep(500);
    	    	}
    		   
    	   }
       }
    	   catch (InterruptedException e) 
    	   {
			e.printStackTrace();
		   }
       }
					
	}
