package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import comparable_comparator.Student;

public class Student_Test {
	public static void main(String[] args) {
		ArrayList<Student> stu = new ArrayList<Student>();
		stu.add(new Student(11, "DDDD", 20));
		stu.add(new Student(13, "AAAA", 18));
		stu.add(new Student(12, "FFFF", 19));
		
		Iterator<Student> itr = stu.iterator();
		System.out.println("Un-sorted list: ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(stu);
		System.out.println("Sorted list: ");
		itr = stu.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
