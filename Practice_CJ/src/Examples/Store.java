package Examples;
import java.util.*;

  public class Store 
    {
      ArrayList<Product> p = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      
      
      public void addProduct()
      {
    	  System.out.println("Enter Product Id: ");
    	  int pid = sc.nextInt();
    	  System.out.println("Enter Product Name: ");
    	  String pname = sc.next();
    	  System.out.println("Enter Product Price: ");
    	  double price = sc.nextInt();
    	  System.out.println("Enter Product Quantity: ");
    	  int pquantity = sc.nextInt();
    	  
    	 p.add (new Product(pid, pname, pquantity, price));
    	 System.out.println("Product added successfully.");
    
      }
      
      public void displayAllPrd()
      {
    	  if(p.isEmpty())
    	  {
    		  System.out.println("No products available.");
    	  }
    	  else
    	  {
    		  System.out.println("All Products:");
    		  for(Product product : p)
    		  {
    			  System.out.println(product);
    		  }
    	  }
      }
     
      public void displayPrdByPrice()
      {
    	  if(p.isEmpty())
    	  {
    		  System.out.println("No products available.");
    	  }
    	  else
    	  {
    		  Collections.sort(p);
    		  System.out.println("Products Sorted by Price:");
    		  for (Product product : p) 
    		  {
                  System.out.println(product);
              }
    		  
    	  }
      }
      public void updatePrd()
      {
    	  System.out.println("Enter ID of product to update: ");
    	  int pid = sc.nextInt();
    	  boolean found = false;
    	  for (Product product : p) 
    	  {
              if (product.getId() == pid)
              {
                  System.out.print("Enter new Price: ");
                  double newPrice = sc.nextDouble();
                  System.out.print("Enter new Quantity: ");
                  int newQuantity = sc.nextInt();
                  product.setPrice(newPrice);
                  product.setQuantity(newQuantity);
                  found = true;
                  System.out.println("Product updated successfully.");
                  break;
              }
      }
    	  if (!found)
    	  {
              System.out.println("Product with ID " + pid + " not found.");
          }    	   
     }
      public void deletePrd()
      {
    	  System.out.print("Enter ID of product to delete: ");
    	  int pid = sc.nextInt();
    	  boolean removed = p.removeIf(product -> product.getId() == pid);
    	  if (removed) 
    	  {
              System.out.println("Product deleted successfully.");
          } 
    	  
    	  else 
    	  {
              System.out.println("Product with ID " + pid + " not found.");
          }
      }
      public double calculateBill()
      {
    	  double totalBill = 0;
    	  for (Product product : p) 
    	  {
              totalBill += product.calculatePriceWithGST();
          }
          return totalBill;
      }
    }
  
      
