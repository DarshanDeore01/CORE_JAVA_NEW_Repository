package VAR;

public class myVaragr
{
	public static void add(String nm,int...a)
	{
	  int sum = 0;
	  for(int x: a)
	 {
		  sum = sum+x;
	  }
	  float avg=(float)sum/a.length;
	
	 System.out.println("Student: " + nm);
	 System.out.println("Sum="+sum);
	 System.out.println("Average: " + avg);
}
}
