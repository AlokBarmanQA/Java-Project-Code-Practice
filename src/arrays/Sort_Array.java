package arrays;

import java.util.Arrays;

public class Sort_Array {

	public static void main(String[] args) {
		// Write a Java program to sort a numeric array and a string array.
		// numaric array
		
		int number[] = {3, 4, 6, 8, 9, 5, 2};
		Arrays.sort(number);
		System.out.println("After sorting: " + Arrays.toString(number));

		System.out.println("\n****************************");
		
		String words[] = {"Java", "Selenium", "Cucumber", "Testng", "Junit"};
		Arrays.sort(words);
		System.out.println("After sorting: " + Arrays.toString(words));
	}

}
