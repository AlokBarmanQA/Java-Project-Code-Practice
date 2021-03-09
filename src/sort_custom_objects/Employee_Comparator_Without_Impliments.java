package sort_custom_objects;

import java.time.LocalDate;
import java.util.Comparator;

public class Employee_Comparator_Without_Impliments {
	private Long id;
	private String name;
	private LocalDate dob;
	public Employee_Comparator_Without_Impliments(Long id, String name, LocalDate dob) {
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public LocalDate getDob() {
		return dob;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	public static Comparator<Employee_Comparator_Without_Impliments> compare_by_id 
	= new Comparator<Employee_Comparator_Without_Impliments>() {

		@Override
		public int compare(Employee_Comparator_Without_Impliments o1, Employee_Comparator_Without_Impliments o2) {
			
			return (int) (o1.getId() - o2.getId());
		}
	};
	
	public static Comparator<Employee_Comparator_Without_Impliments> compare_by_name 
	= new Comparator<Employee_Comparator_Without_Impliments>() {

		@Override
		public int compare(Employee_Comparator_Without_Impliments o1, Employee_Comparator_Without_Impliments o2) {
			
			return o1.getName().compareTo(o2.getName());
		}
	};
	
	public static Comparator<Employee_Comparator_Without_Impliments> compare_by_dob 
	= new Comparator<Employee_Comparator_Without_Impliments>() {

		@Override
		public int compare(Employee_Comparator_Without_Impliments o1, Employee_Comparator_Without_Impliments o2) {
			
			return o1.getDob().compareTo(o2.getDob());
		}
	};
}
