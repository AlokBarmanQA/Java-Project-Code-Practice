package arrays;

import java.util.Arrays;

public class Second_Smallest_Element {
	// Write a Java program to find the second smallest element in an array.
	// it  only works for positive integer***********
	public static void main(String[] args) {
		// Write a Java program to find the second largest element in an array.
		int[] arr = {-1, 1, 1, 2, 2, 2, 10, 10, 11, 11, 11};
		Arrays.sort(arr);
		
		int index = arr[0];
		
		while(arr[index] == arr[0]) {
			index++;
		}
		System.out.println("Second highest number: "+arr[index]);
		System.out.println("**********************************");
		// looping from second element
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != arr[0]) {
				System.out.println("Second highest element: "+arr[i]);
				break;
			}
		}
	}

}
