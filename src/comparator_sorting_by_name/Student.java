package comparator_sorting_by_name;

import java.util.Comparator;

public class Student {
	private int roll;
	private String name;
	private int marks;
	public Student(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	/*Comparator for sorting the list by Student Name*/
	public static Comparator<Student> student_name_comparator = new Comparator<Student>() {

		public int compare(Student o1, Student o2) {
			String student_name1 = o1.getName().toUpperCase();
			String student_name2 = o2.getName().toUpperCase();
			//ascending order
			return student_name1.compareTo(student_name2);
			//descending order
//			return student_name2.compareTo(student_name1);
		}
	};

	/*Comparator for sorting the list by Student marks*/
	public static Comparator<Student> student_marks_comparator = new Comparator<Student>() {
		public int compare(Student o1, Student o2) {
			int mark1 = o1.getMarks();
			int mark2 = o2.getMarks();
			// ascending order
//			return mark1 - mark2;
			// descending order
			return mark2 - mark1;
		}
	};

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
}
