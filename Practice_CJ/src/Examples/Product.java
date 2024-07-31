package Examples;
import java.util.*;
public class Product implements Comparable<Product>
{
      int pid;
      String pname;
      int pquantity;
      double price;
      public static final double  GST = 0.18;
      
	public Product() 
	{
		  pid=0;
	      pname=null;
	      pquantity=0;
	      price=0;
	}

	public Product(int pid, String pname, int pquantity, double price)
	{
		this.pid = pid;
		this.pname = pname;
		this.pquantity = pquantity;
		this.price = price;
	}

	public int getId() 
	{
		return pid;
	}

	public void setId(int id) 
	{
		this.pid = id;
	}

	public String getName() 
	{
		return pname;
	}

	public void setName(String name) 
	{
		this.pname = name;
	}

	public int getQuantity() 
	{
		return pquantity;
	}

	public void setQuantity(int quantity) 
	{
		this.pquantity = quantity;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}
		
	 public double calculatePriceWithGST() 
	 {
	        return price * pquantity * (1 + GST);
	  }

	@Override
	public String toString() 
	{
		return "Product ID: " + pid + "Product Name: " + pname + "Product Quantity: " + pquantity + "Product Price: " + price;
	}
	@Override
    public int compareTo(Product other) 
	{
        return Double.compare(this.price, other.price);
    }
		                
}// End Class
