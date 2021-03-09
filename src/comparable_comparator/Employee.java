package comparable_comparator;

public class Employee implements Comparable<Employee> {
	private int emp_id;
	private String emp_name;
	private double emp_salary;

	public Employee(int emp_id, String emp_name, double emp_salary) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}

	public int getEmp_id() {
		return emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public double getEmp_salary() {
		return emp_salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + "]";
	}

	public int compareTo(Employee o) {
		// Descending order
		return o.emp_id - this.emp_id;
		//	return o.emp_name.compareTo(this.emp_name);
		//	return (int) (o.emp_salary - this.emp_salary);

		// Ascending order
		//	return this.emp_id - o.emp_id;
		//	return this.emp_name.compareTo(o.emp_name);
		//	return (int) (this.emp_salary - o.emp_salary);
	}	
}
