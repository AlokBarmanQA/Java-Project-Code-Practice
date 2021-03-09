package comparator_sorting_by_name;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee_Test_ID {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(3, "Ssss", 6000));
		list.add(new Employee(1, "Yyyy", 7000));
		list.add(new Employee(2, "Aaaa", 8000));
		System.out.println("Un-sorted list: ");
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(list, Employee.compare_by_emp_id);
		System.out.println("Sorted by employee id: ");
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
