package reflection;


	
	import java.lang.reflect.Constructor;
	import java.lang.reflect.Field;
	import java.lang.reflect.Method;


	class Emp
	{
		private int empid_private;
		String ename_default;
		public int ek_public;
		protected int ey_protected;
		public Emp()
		{
			
		}
		public Emp(int empid, String name) {
			
		}
		@Override
		public String toString() {
			return "Emp "+empid_private ;
		}	
		public void showemp_public()
		{
			System.out.println(toString());
		}
		protected void displayemp_protected()
		{
			
		}
		
	}
	class Manager extends Emp
	{
		int mincentive_default;
		public int mr_public;
		private int mz_private;
		protected int mv_protected;
		
		public Manager() {
		
			super();
		}

		Manager(int id,String name,int incentive) {
			
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}	
		protected void managerdisplay_protected()
		{
			
		}
		public void print_manager_public()
		{
			
		}
	}

	public class Demo3
	{
		public static void main(String[] args) throws ClassNotFoundException 
		{
			
		 Class c = Class.forName("reflection.Manager");
	
		 
		 System.out.println(c);	//print the value of reference 
		
		Class sname=c.getSuperclass(); //finding out name of super class
		 System.out.println(sname);
		 
		System.out.println("********************************Declared methods");

		 Method []marr=c.getDeclaredMethods();// show all methods of Manager class only
		 for (int i = 0; i < marr.length; i++) {
			 System.out.println(marr[i]);	 
			}		 
		 
		 
		 System.out.println("******************************** methods********");
			
		 Method []marr1=c.getMethods();// show only public methods from entire hierarchy
		 for (int i = 0; i < marr1.length; i++) {
			 System.out.println(marr1[i]);	 
			}
		 System.out.println("******************************** declared constructors ");

		 Constructor cs[]=c.getDeclaredConstructors();
		 for (int i = 0; i < cs.length; i++) {
			 System.out.println(cs[i]);	 
			}
		    System.out.println("********************************constructors ");

		  Constructor cs1[]=c.getConstructors();
		 for (int i = 0; i < cs1.length; i++) {
			 System.out.println(cs1[i]);	 
			}
		 
		  System.out.println("********************************getFields ");
			 Field f[]= c.getFields();  //get only public fields of base and derive class 
		 for (int i = 0; i < f.length; i++) {
			 System.out.println(f[i]);	 
			}
		  System.out.println("********************************getDeclaredFields ");
		 Field f1[]= c.getDeclaredFields();  //get all fields of Manager class only 
		 for (int i = 0; i < f1.length; i++) {
			 System.out.println(f1[i]);	 
			 
			 
			}
			
			
			
		}
		
	}


