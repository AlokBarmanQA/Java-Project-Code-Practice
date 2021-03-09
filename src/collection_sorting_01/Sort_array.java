package collection_sorting_01;

import java.util.Arrays;
import java.util.Collections;

public class Sort_array {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {15, 11, 9, 55, 47, 18, 520, 1123, 366, 420};
		System.out.println("Un-sorted arrays: "+ Arrays.asList(arr));
		
		Arrays.sort(arr);
		
		System.out.println("Sorted in ascending order: "+ Arrays.toString(arr));
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println("Sorted in descending order: "+ Arrays.toString(arr));
	}

}
