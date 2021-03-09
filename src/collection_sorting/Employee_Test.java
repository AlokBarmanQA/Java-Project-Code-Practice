package collection_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Employee_Test {

	public static void main(String[] args) {
		List <Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(101, "xxxx", 30));
		emp.add(new Employee(103, "bbbb", 29));
		emp.add(new Employee(102, "aaaa", 27));
		
		System.out.println("Before sorting custom list of employees : ");
		Iterator<Employee> itr = emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(emp);
		System.out.println("After sorting custom list of employees in natural order: ");
		itr = emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(emp, Collections.reverseOrder());
		
		System.out.println("After sorting custom list of employees in reverse order: ");
		itr = emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
