package Collection_Employee;
import java.util.Comparator;
@SuppressWarnings("rawtypes")
public class CompareByName implements Comparator  {
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Employee e1= (Employee) o1;
		Employee e2= (Employee) o2;

		
		return e1.name.compareTo(e2.name);
	}

}






	