package arrays;

import java.util.Arrays;

public class Second_Highest_Element {
	// Write a Java program to find the second largest element in an array.
	
	public static void main(String[] args) {
		// Write a Java program to find the second largest element in an array.
		int[] arr = {1, 2, 5, 5, 8, 9, 7, 10, 9, 10, 10, 11, 11, 11};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int index = arr.length-1;
		System.out.println(arr[index]);
		while(arr[index] == arr[arr.length-1]) {
			index--;
		}
		System.out.println(arr[index]);
		System.out.println("**********************************");
		// looping from second element
		for(int i=arr.length-2; i>=0; i--) {
			if(arr[i] != arr[arr.length-1]) {
				System.out.println("Second highest element: "+arr[i]);
				break;
			}
		}
	}

}
