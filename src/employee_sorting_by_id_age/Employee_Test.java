package employee_sorting_by_id_age;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee_Test {
	
	public static void main(String[] args) {
		ArrayList <Employee> emp = new ArrayList <Employee> ();
		emp.add(new Employee(51, "NNNN", 27));
		emp.add(new Employee(25, "ZZZZ", 40));
		emp.add(new Employee(41, "AAAA", 46));
		
		System.out.println("Un-soted list: ");
		Iterator <Employee> itr = emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(emp, new Employee_Sorting_by_id());
		System.out.println("Sorted list by id: ");
		itr = emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(emp, new Employee_Sorting_by_age());
		System.out.println("Sorted list by age: ");
		itr = emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
