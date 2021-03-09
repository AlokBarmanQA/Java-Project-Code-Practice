package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee_Test {

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
		Collections.sort(list);
		System.out.println("Sorted by employee id: ");
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
