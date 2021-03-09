package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Convert_ArrayList_To_Array {

	public static void main(String[] args) {
		// Write a Java program to convert an ArrayList to an array.
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("One","Two","Three"));
		
		String[] arr = new String[list.size()];
		list.toArray(arr);
		
		for(String word : arr) {
			System.out.print(word+", ");
		}
	}

}
