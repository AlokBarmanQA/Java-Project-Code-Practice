package arrays;

import java.util.Arrays;

public class Copy_An_Array {

	public static void main(String[] args) {
		// Write a Java program to copy an array by iterating the array.
		
		int[] my_array = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365};
		
		int[] new_array = new int[10];
		
		for(int i=0; i<my_array.length; i++) {
			new_array[i] = my_array[i];
		}
		
		System.out.println("new array: "+ Arrays.toString(new_array));
	}

}
