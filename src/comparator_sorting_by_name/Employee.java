package comparator_sorting_by_name;

import java.util.Comparator;

public class Employee {
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
	public static Comparator<Employee> compare_by_emp_id = new Comparator<Employee>() {
		public int compare(Employee o1, Employee o2) {
			int emp_id_1 = o1.getEmp_id();
			int emp_id_2 = o2.getEmp_id();
			// ascending order
			return emp_id_1 - emp_id_2;
			// descending order
//			return emp_id_2 - emp_id_1;
		}
	};
	public static Comparator<Employee> compare_by_emp_name = new Comparator<Employee>() {
		public int compare(Employee o1, Employee o2) {
			String emp_name_1 = o1.getEmp_name().toUpperCase();
			String emp_name_2 = o2.getEmp_name().toUpperCase();
			// ascending order
			return emp_name_1.compareTo(emp_name_2);
			// descending order
//			return emp_name_2.compareTo(emp_name_1);
		}
	};
	public static Comparator<Employee> compare_by_emp_sarary = new Comparator<Employee>() {
		public int compare(Employee o1, Employee o2) {
			double salary1 = o1.getEmp_salary();
			double salary2 = o2.getEmp_salary();
			// ascending order
			return (int) (salary1 - salary2);
			// descending order
//			return (int) (salary2 - salary1);
		}
	};
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + "]";
	}	
}
