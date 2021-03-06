package arrays;

import java.util.Arrays;

public class Insert_An_Element {

	public static void main(String[] args) {
		// Write a Java program to insert an element (specific position) into an array.
		
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		
		int len = my_array.length;
		int index_position = 3;
		int new_number = 12;
		
		for(int i=len-1; i>index_position; i--) {
			my_array[i] = my_array[i-1];
		}
		my_array[index_position] = new_number;
		
		System.out.println(Arrays.toString(my_array));
	}

}
