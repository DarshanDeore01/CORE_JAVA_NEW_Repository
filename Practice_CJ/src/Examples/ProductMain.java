package Examples;
import java.util.*;


public class ProductMain
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		Store st = new Store();
		int ch = 0;
		
		do
	        {
	        	   System.out.println("1)Add Product");
	        	   System.out.println("2)Display All Products");
	        	   System.out.println("3)Display Product by Sorted Price ");
	        	   System.out.println("4)Update Product Information");
	        	   System.out.println("5)Delete Product");
	        	   System.out.println("6)Create Bill");
	        	   System.out.println("7)Exit");
	        	   System.out.println("Enter Your Choice");
	               ch=sc.nextInt();
	      
	        	switch(ch)
	        	{
	        	 case 0:
	                    System.out.println("Exiting...");
	                    break;
	        	case 1 :
	        		   st.addProduct();
	             		 break;
	        	case 2 :
	        		st.displayAllPrd();
	        		break;
	        	case 3 :
	        		st.displayPrdByPrice();
	        		break;
	        	case 4 :
	        		st.updatePrd();
	        		break;
	        	case 5 :
	        		st.deletePrd();
	        		break;
	        	case 6 :
	        		double bill = st.calculateBill();
	        		System.out.println("Total Bill: Rs" + bill);
	        		break;
	        	default:
                    System.out.println("Invalid choice.");
	        		
	        	}
	         }
		while (ch != 0);
	}
}

