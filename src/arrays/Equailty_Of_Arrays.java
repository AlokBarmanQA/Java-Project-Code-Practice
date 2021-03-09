package arrays;

import java.util.Arrays;

public class Equailty_Of_Arrays {

	public static void main(String[] args) {
		// Write a Java program to test the equality of two arrays.

		Integer[] arr1 = {1, 2, 3, 4, 5};
		Integer[] arr2 = {1, 2, 3, 4, 6};
	//	Integer[] arr2 = {1, 2, 3, 4, 5};

		if(Arrays.equals(arr1, arr2)) {
			System.out.println("arr1 and arr2 array are equal");
		}
		else {
			System.out.println("Both arrays are different");
		}
	}
}
