package collection_sorting_01;

import java.util.Arrays;

public class Sort_array_in_range {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {15, 11, 9, 55, 47, 18, 520, 1123, 366, 420};
		
		System.out.println("Un-sorted arrays: " + Arrays.toString(arr));
		
		Arrays.sort(arr, 0, 6);
		
		System.out.println("Sorted arrays: "+ Arrays.toString(arr));
		
	}

}
