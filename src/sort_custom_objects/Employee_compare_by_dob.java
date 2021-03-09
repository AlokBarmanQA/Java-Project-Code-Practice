package sort_custom_objects;

import java.util.Comparator;

public class Employee_compare_by_dob implements Comparator<Employee_Comparator>{

	@Override
	public int compare(Employee_Comparator o1, Employee_Comparator o2) {
		
		return o1.getDob().compareTo(o2.getDob());
	}

}
