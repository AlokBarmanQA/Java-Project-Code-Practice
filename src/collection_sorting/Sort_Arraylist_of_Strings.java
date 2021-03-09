package collection_sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_Arraylist_of_Strings {

	public static void main(String[] args) {
		
		List <String> names = Arrays.asList("David", "Alex", "Charles", "Brian");
		
		System.out.println("Un-sorted list: " + names);
		
		Collections.sort(names);
		
		System.out.println("Sorted list: " + names);
		
		Collections.sort(names, Collections.reverseOrder());
		
		System.out.println("Sorted list descending order: "+ names);
	}

}
