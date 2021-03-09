package sort_custom_objects;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee_Comparable_Test {

	public static void main(String[] args) {
		ArrayList<Employee_Comparable> list = new ArrayList<Employee_Comparable>();
		
		list.add(new Employee_Comparable(1l, "Alex", LocalDate.of(2018, Month.APRIL, 21)));
		list.add(new Employee_Comparable(4l, "Brian", LocalDate.of(2018, Month.APRIL, 22)));
		list.add(new Employee_Comparable(3l, "Piyush", LocalDate.of(2018, Month.APRIL, 25)));
		list.add(new Employee_Comparable(5l, "Charles", LocalDate.of(2018, Month.APRIL, 23)));
		list.add(new Employee_Comparable(2l, "Pawan", LocalDate.of(2018, Month.APRIL, 24)));
		
		System.out.println("Un-sorted list: ");
		Iterator <Employee_Comparable> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(list);
		
		System.out.println("Sorted list: ");
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
