package arrays;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_Integer_Array {

	public static void main(String[] args) {
		// Write a Java program to reverse an array of integer values.
		
		int my_array[] = {23, 92, 56, 39, 93, 11};
		int len = my_array.length;
		
		for(int i=0; i < len/2; i++) {
			int temp = my_array[i];
			my_array[i] = my_array[len-(i+1)];
			my_array[len-(i+1)] = temp;
		}
		System.out.println(Arrays.toString(my_array));
		System.out.println("****************************************");
		// Second method
		int myArray[] = new int[] {1, 2, 3, 4, 5};
		for(int i=0; i<myArray.length; i++) {
			System.out.print(myArray[i]+" ");
		}
		System.out.println();
		for(int i=myArray.length-1; i>=0; i--) {
			System.out.print(myArray[i]+" ");
		}
		System.out.println();
		// Third method
		Integer [] arr = {10, 20, 30, 40, 50};
		
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.asList(arr));
	}

}
