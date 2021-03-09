package comparable_comparator;

public class Student implements Comparable<Student>{
	private int roll;
	private String name;
	private int age;
	public Student(int roll, String name, int age) {
		this.roll = roll;
		this.name = name;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}
	public int compareTo(Student o) {
//		String name = ((Student)o).getName();
//		return this.age - o.age;
//		return this.roll - o.roll; // ascending order
		return o.age - this.age; // descending order
	}
	
	/*Comparator for sorting the list by Student Name*/
	
}
