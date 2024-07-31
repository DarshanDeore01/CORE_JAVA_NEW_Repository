package Exception;

public class Demo {

	public static void Square()
	{
		int a=2;
		if(a<0)
			throw new ArithmeticException(" Base Number Cant Not Be NEGATIVE.....!!!");
		int sqr=a*a;
		System.out.println("Square of " +a+" is = " +sqr);
	}	
}
