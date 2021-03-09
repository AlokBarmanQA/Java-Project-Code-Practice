package collection_sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Employee_01_Test {

	public static void main(String[] args) {
		ArrayList <Employee_01> employees = getUnSortedEmployeeList();
		//1. Employee ids in ascending order
		Collections.sort(employees);
		System.out.println(employees);
		//2. Employee ids in reverse order
		Collections.sort(employees, Collections.reverseOrder());
		System.out.println(employees);
	}

	public static ArrayList<Employee_01> getUnSortedEmployeeList() {
		ArrayList <Employee_01> list = new ArrayList<Employee_01>();
		Random rand = new Random(10);
	       for(int i = 0; i < 5; i++) {
	            Employee_01 emp = new Employee_01();
	            emp.setId(rand.nextInt(100));
	            list.add(emp);
	        }
	       return list;
	}
}
