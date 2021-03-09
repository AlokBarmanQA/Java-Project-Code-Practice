package sort_custom_objects;

import java.time.LocalDate;

public class Employee_Comparator {
	private Long id;
	private String name;
	private LocalDate dob;
	public Employee_Comparator(Long id, String name, LocalDate dob) {
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

}
