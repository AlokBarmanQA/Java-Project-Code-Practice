package employee_sorting_by_id_age;

import java.util.Comparator;

public class Employee_Sorting_by_age implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		
		return o1.age - o2.age;
	}

}
