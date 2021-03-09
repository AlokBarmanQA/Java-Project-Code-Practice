package collection_sorting_01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_a_List {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {15, 11, 9, 55, 47, 18, 520, 1123, 366, 420};
		
		List<Integer> list = Arrays.asList(arr);
		
		System.out.println("Un-sorted list: "+ list);
		// ascending order
		Collections.sort(list);
		
		System.out.println("Sorted ascending in order: " + list);
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println("Sorted descending in order: " + list);
	}

}
