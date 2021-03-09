package sort_custom_objects;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee_Test_Comparator_Without_Impliments {

	public static void main(String[] args) {
		ArrayList<Employee_Comparator_Without_Impliments> list = new ArrayList<Employee_Comparator_Without_Impliments>();
		
		list.add(new Employee_Comparator_Without_Impliments(1l, "Alex", LocalDate.of(2018, Month.APRIL, 21)));
		list.add(new Employee_Comparator_Without_Impliments(4l, "Brian", LocalDate.of(2018, Month.APRIL, 23)));
		list.add(new Employee_Comparator_Without_Impliments(3l, "Piyush", LocalDate.of(2018, Month.APRIL, 25)));
		list.add(new Employee_Comparator_Without_Impliments(5l, "Charles", LocalDate.of(2018, Month.APRIL, 22)));
		list.add(new Employee_Comparator_Without_Impliments(2l, "Pawan", LocalDate.of(2018, Month.APRIL, 24)));
		
		System.out.println("Un-sorted list: ");
		Iterator <Employee_Comparator_Without_Impliments> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(list, Employee_Comparator_Without_Impliments.compare_by_id);
		System.out.println("Sorted list by ID: ");
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(list, Employee_Comparator_Without_Impliments.compare_by_name);
		System.out.println("Sorted list by Name: ");
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(list, Employee_Comparator_Without_Impliments.compare_by_dob);
		System.out.println("Sorted list by DOB: ");
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
