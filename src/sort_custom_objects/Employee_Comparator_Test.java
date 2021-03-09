package sort_custom_objects;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee_Comparator_Test {

	public static void main(String[] args) {
		ArrayList<Employee_Comparator> list = new ArrayList<Employee_Comparator>();
		
		list.add(new Employee_Comparator(1l, "Alex", LocalDate.of(2018, Month.APRIL, 21)));
		list.add(new Employee_Comparator(4l, "Brian", LocalDate.of(2018, Month.APRIL, 22)));
		list.add(new Employee_Comparator(3l, "Piyush", LocalDate.of(2018, Month.APRIL, 25)));
		list.add(new Employee_Comparator(5l, "Charles", LocalDate.of(2018, Month.APRIL, 23)));
		list.add(new Employee_Comparator(2l, "Pawan", LocalDate.of(2018, Month.APRIL, 24)));
		
		System.out.println("Un-sorted list: ");
		Iterator <Employee_Comparator> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(list, new Employee_compare_by_id());
		
		System.out.println("Sorted list by Employee_compare_by_id: ");
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(list, new Employee_compare_by_name());
		System.out.println("Sorted list by Employee_compare_by_name: ");
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(list, new Employee_compare_by_dob());
		System.out.println("Sorted list by Employee_compare_by_dob: ");
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
