package collection_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Student_Test {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(113, "aaaa", "Pennsylvania"));
		list.add(new Student(111, "cccc", "New York"));
		list.add(new Student(112, "bbbb", "North Carollina"));
		
		System.out.println("Before sorting: ");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		
		Collections.sort(list, new Student_Sort_By_Roll());
		System.out.println("After sorting: ");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
	}

}
