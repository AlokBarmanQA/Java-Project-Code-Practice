package arrays;

import java.util.Arrays;

public class Remove_Element_From_Array {

	public static void main(String[] args) {
		// Write a Java program to remove a specific element from an array.
		
		int[] my_array = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456};
		
		int len = my_array.length;
		
		int remove_index = 10;
		
		for(int i = remove_index; i < len-1; i++) {
			my_array[i] = my_array[i+1];
		}
		System.out.println(Arrays.toString(my_array));
	}

}
