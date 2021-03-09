package collection_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_ArrayList_Ascending_Order {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Selenium");
		list.add("Cucumber");
		list.add("Postman");
		System.out.println("Before sorting: "+ list);
		
		Collections.sort(list);
		System.out.println("After sorting: "+ list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Reverse order sorting: "+ list);
		
	}

}
