package collection_sorting;

import java.util.Comparator;

public class Student_Sort_By_Roll implements Comparator<Student>{
	
	public int compare(Student a, Student b) {
		
		return a.rollno - b.rollno;
	}
}
