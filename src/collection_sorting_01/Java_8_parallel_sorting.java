package collection_sorting_01;

import java.util.Arrays;

public class Java_8_parallel_sorting {

	public static void main(String[] args) {
//		Integer[] arr = new Integer[] {15, 11, 9, 55, 47, 18, 520, 1123, 366, 420};
		int[] arr = new int[]{15, 11, 9, 55, 47, 18, 520, 1123, 366, 420};
		System.out.println("Un-sorted arrays: "+ Arrays.toString(arr));
		
//		Arrays.parallelSort(arr);
		
		System.out.println("Sorted arrays: "+ Arrays.toString(arr));
		
//		Arrays.parallelSort(arr, 0, 6);
//		
//		System.out.println("Sorted in range: "+ Arrays.toString(arr));
//		
//		Arrays.parallelSort(arr, Collections.reverseOrder());
//		
//		System.out.println("Sorted in reverse order: "+ Arrays.toString(arr));
	}

}
