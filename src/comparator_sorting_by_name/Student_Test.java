package comparator_sorting_by_name;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student_Test {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(21, "Kkkk", 70));
		list.add(new Student(25, "Gggg", 80));
		list.add(new Student(23, "Aaaa", 90));
		
		System.out.println("Un-sorted list: ");
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(list, Student.student_name_comparator);
		System.out.println("Sorted list by name: ");
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
