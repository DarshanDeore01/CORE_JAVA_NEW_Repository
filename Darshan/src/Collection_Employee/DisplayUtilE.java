package Collection_Employee;
import java.util.ArrayList;
import java.util.Iterator;



public class DisplayUtilE {
	@SuppressWarnings("rawtypes")
	public static void displayEmployee(ArrayList a1) {
		Iterator it= a1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

}
