package sort_custom_objects;

import java.time.LocalDate;

public class Employee_Comparable implements Comparable<Employee_Comparable>{
	private Long id;
	private String name;
	private LocalDate dob;
	public Employee_Comparable(Long id, String name, LocalDate dob) {
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
//	   @Override
//	    public int compareTo(Employee o) {
//	        return (int) (this.getId() - o.getId());
//	    }
//	   @Override
//	    public int compareTo(Employee o) {
//	        return this.getName().compareTo(o.getName());
//	    }
	   
	   @Override
	    public int compareTo(Employee_Comparable o) {
	        return this.getDob().compareTo(o.getDob());
	    }
}
